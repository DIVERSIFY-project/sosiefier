package fr.inria.diversify.transformation.ast;


import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.factory.Factory;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;


/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:20 PM
 */
public class ASTDelete extends ASTTransformation {

    public ASTDelete() {
        name = "delete";
        type = "adrStmt";
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();
        object.put("transplantationPoint", transplantationPoint.toJSONObject());

        return object;
    }

    protected void applyInfo() {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("transplantation point:\n{}", transplantationPoint);
        Log.debug("{}", transplantationPoint.getCtCodeFragment().getPosition());
        Log.debug("{}", transplantationPoint.getCodeFragmentType());
    }

    /**
     * All AST transformations takes the transplantation point (TP) and replaces it by :
     * 1. The TP + transplant (add operation)
     * 2. The transplant (replace operation)
     * 3. And empty statement (delete operation)
     * <p/>
     * This method builds the such replacement element
     *
     * @return The resulting CtElement after the transformation
     * @throws Exception
     * @Note: Renamed after buildCopyElement.
     **/
    @Override
    protected CtCodeElement buildReplacementElement() {
        Factory factory = transplantationPoint.getCtCodeFragment().getFactory();
        CtCodeSnippetStatement snippetStatement = factory.Core().createCodeSnippetStatement();
        snippetStatement.setValue("/** TRANSFORMATION FRAGMENT DELETED:\n"+ transplantationPoint.getCodeFragmentType().toString() + "\n**/");
        return snippetStatement;
    }

    public  int hashCode() {
        return super.hashCode() * transplantationPoint.getCompilationUnit().hashCode() * transplantationPoint.getStartLine();
    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!(other instanceof ASTDelete))
            return  false;
        ASTDelete otherDelete = (ASTDelete)other;

        if(!equalParent(otherDelete.parent))
            return false;

           return  status == otherDelete.status &&
                   name.equals(otherDelete.name) &&
                   failures.equals(otherDelete.failures) &&
                   transplantationPoint.getCtCodeFragment().getPosition().equals(otherDelete.transplantationPoint.getCtCodeFragment().getPosition());
    }

    public boolean usedOfSubType() {
        return false;
    }

    public void updateStatementList() {
        getInputProgram().getCodeFragments().remove(transplantationPoint);
    }

    @Override
    public String toString() {
        return "delete\ntransplantationPoint: "+ transplantationPoint.toString()+"\n";
    }
}
