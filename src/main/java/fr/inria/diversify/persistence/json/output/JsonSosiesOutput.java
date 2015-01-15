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
        sections.add(0, new JsonASTReplaceOutput());
        sections.add(0, new JsonASTDeleteOutput());
        sections.add(0, new JsonASTAddOutput());
        sections.add(0, new JsonHeaderOutput());
    }
}
