package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.support.reflect.declaration.CtClassImpl;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nharrand on 17/05/17.
 */
public class AddMethodInvocationStatsQuery extends TransformationQuery {

    public Set<PrPackage> packages = new HashSet<>();
    public int tstaticStmt = 0, tnonStaticStmt = 0;
    public int tstaticPublicMethods = 0,
            tnonStaticPublicMethods = 0,
            tstaticProtectedMethods = 0,
            tnonStaticProtectedMethods = 0,
            tstaticPrivateMethods = 0,
            tnonStaticPrivateMethods = 0;

    public AddMethodInvocationStatsQuery(InputProgram inputProgram, String output) {
        super(inputProgram);

        for(CtPackage ctPackage :inputProgram.getFactory().Package().getAll()) {
            PrPackage pa = new PrPackage(ctPackage);
            packages.add(pa);
            tstaticStmt += pa.pstaticStmt;
            tnonStaticStmt += pa.pnonStaticStmt;
            tstaticPublicMethods += pa.pstaticPublicMethods;
            tnonStaticPublicMethods += pa.pnonStaticPublicMethods;
            tstaticProtectedMethods += pa.pstaticProtectedMethods;
            tnonStaticProtectedMethods += pa.pnonStaticProtectedMethods;
            tstaticPrivateMethods += pa.pstaticPrivateMethods;
            tnonStaticPrivateMethods += pa.pnonStaticPrivateMethods;

        }
        JSONObject json = new JSONObject();
        try {
            json.put("dir", inputProgram.getRelativeSourceCodeDir());
            json.put("staticStmt", tstaticStmt);
            json.put("nonStaticStmt", tnonStaticStmt);
            json.put("nonStaticProtectedMethods",tnonStaticProtectedMethods);
            json.put("staticPublicMethods",tstaticPublicMethods);
            json.put("nonStaticPublicMethods",tnonStaticPublicMethods);
            json.put("staticProtectedMethods",tstaticProtectedMethods);
            json.put("staticPrivateMethods",tstaticPrivateMethods);
            json.put("nonStaticPrivateMethods",tnonStaticPrivateMethods);
            JSONArray packageArray = new JSONArray();
            for(PrPackage p : packages) {
                packageArray.put(p.toJSON());
            }
            json.put("packages", packageArray);

            FileUtils.writeFile(json, new File(output));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Transformation query() throws QueryException {
        throw new QueryException("This querry is just supposed to produce stats");
        //return null;
    }

    class PrPackage {
        public String pname;

        public Set<PrType> types = new HashSet<>();
        public int pstaticStmt = 0, pnonStaticStmt = 0;
        public int pstaticPublicMethods = 0,
                pnonStaticPublicMethods = 0,
                pstaticProtectedMethods = 0,
                pnonStaticProtectedMethods = 0,
                pstaticPrivateMethods = 0,
                pnonStaticPrivateMethods = 0;

        public PrPackage (CtPackage p) {
            pname = p.getQualifiedName();
            for(CtType t: p.getTypes()) {
                if(t instanceof CtClassImpl)
                    types.add(new PrType(t));
            }
        }

        public JSONObject toJSON() throws JSONException {
            JSONObject res = new JSONObject();
            res.put("name", pname);
            res.put("staticStmt", pstaticStmt);
            res.put("nonStaticStmt", pnonStaticStmt);
            res.put("nonStaticProtectedMethods",pnonStaticProtectedMethods);
            res.put("staticPublicMethods",pstaticPublicMethods);
            res.put("nonStaticPublicMethods",pnonStaticPublicMethods);
            res.put("staticProtectedMethods",pstaticProtectedMethods);
            res.put("staticPrivateMethods",pstaticPrivateMethods);
            res.put("nonStaticPrivateMethods",pnonStaticPrivateMethods);
            JSONArray typeArray = new JSONArray();
            for(PrType t : types) {
                typeArray.put(t.toJSON());
            }
            res.put("types", typeArray);
            return res;
        }

        class PrType {
            public String tname;
            public int staticStmt = 0, nonStaticStmt = 0;
            public int staticPublicMethods = 0,
                    nonStaticPublicMethods = 0,
                    staticProtectedMethods = 0,
                    nonStaticProtectedMethods = 0,
                    staticPrivateMethods = 0,
                    nonStaticPrivateMethods = 0;

            public Set<PrMethod> methods = new HashSet<>();

            public PrType (CtType t) {
                tname = t.getQualifiedName();
                for(Object o : t.getMethods()) {
                    CtMethod<?> m = (CtMethod<?>) o;
                    methods.add(new PrMethod(m));
                }
            }

            public JSONObject toJSON() throws JSONException {
                JSONObject res = new JSONObject();
                res.put("name", tname);
                res.put("staticStmt", staticStmt);
                res.put("nonStaticStmt", nonStaticStmt);
                res.put("nonStaticProtectedMethods",nonStaticProtectedMethods);
                res.put("staticPublicMethods",staticPublicMethods);
                res.put("nonStaticPublicMethods",nonStaticPublicMethods);
                res.put("staticProtectedMethods",staticProtectedMethods);
                res.put("staticPrivateMethods",staticPrivateMethods);
                res.put("nonStaticPrivateMethods",nonStaticPrivateMethods);
                JSONArray methodArray = new JSONArray();
                for(PrMethod m : methods) {
                    methodArray.put(m.toJSON());
                }
                res.put("methods", methodArray);
                return res;
            }

            class PrMethod {
                public String mname;
                public boolean isPublic, isProtected, isPrivate, isStatic, isAbstract;
                public int stmt;


                public PrMethod (CtMethod m) {
                    mname = m.getSimpleName();
                    isPublic = m.getModifiers().contains(ModifierKind.PUBLIC);
                    isProtected = m.getModifiers().contains(ModifierKind.PROTECTED);
                    isPrivate = m.getModifiers().contains(ModifierKind.PRIVATE);
                    isStatic = m.getModifiers().contains(ModifierKind.STATIC);
                    if(!m.getModifiers().contains(ModifierKind.ABSTRACT)) {
                        stmt = m.getBody().getStatements().size();

                        if(isStatic) {
                            staticStmt += stmt;
                            pstaticStmt += stmt;
                            if(isPublic) {
                                staticPublicMethods++;
                                pstaticPublicMethods++;
                            } else if (isProtected) {
                                staticProtectedMethods++;
                                pstaticProtectedMethods++;
                            } else if (isPrivate) {
                                staticPrivateMethods++;
                                pstaticPrivateMethods++;
                            }
                        } else {
                            nonStaticStmt += stmt;
                            pnonStaticStmt += stmt;
                            if(isPublic) {
                                nonStaticPublicMethods++;
                                pnonStaticPublicMethods++;
                            } else if (isProtected) {
                                nonStaticProtectedMethods++;
                                pnonStaticProtectedMethods++;
                            } else if (isPrivate) {
                                nonStaticPrivateMethods++;
                                pnonStaticPrivateMethods++;
                            }
                        }
                        isAbstract = false;
                    } else {
                        isAbstract = true;
                        stmt = 0;
                    }
                }

                public JSONObject toJSON() throws JSONException {
                    JSONObject res = new JSONObject();
                    res.put("name", mname);
                    res.put("isStatic", isStatic);
                    res.put("isPublic", isPublic);
                    res.put("isProtected", isProtected);
                    res.put("isPrivate", isPrivate);
                    res.put("nbStmt", stmt);
                    return res;
                }
            }
        }
    }
}
