package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.SectionOutput;
import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesOutput extends JsonTransformationOutput {

    public JsonSosiesOutput(Collection<Transformation> transformations, String uri, List<SectionOutput> sections) {
        super(transformations, uri, sections);
        sections.add(new JsonASTAddOutput());
        sections.add(new JsonASTReplaceOutput());
        sections.add(new JsonASTDeleteOutput());
    }


    public JsonSosiesOutput(Collection<Transformation> transformations, String uri) {
        super(transformations, uri);
        this.sections = new ArrayList<>();
        sections.add(new JsonHeaderOutput());
        sections.add(new JsonASTReplaceOutput());
        sections.add(new JsonASTDeleteOutput());
        sections.add(new JsonASTAddOutput());
    }

    @Override
    protected void initialize() {
        super.initialize();
        //This is a (non optimal) solution to ensure all transformations
        //have an unique ID before they persist to the JSON file.
        //UUI [http://en.wikipedia.org/wiki/Universally_unique_identifier] seems like an over kill
        int id = 0;
        for ( Transformation t : transformations ) t.setIndex(id++);
    }
}
