package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.SectionOuput;
import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosiesOutput extends JsonTransformationOutput {

    public JsonSosiesOutput(List<SectionOuput> sections, String uri, Collection<Transformation> transformations) {
        super(sections, uri, transformations);
    }

    public JsonSosiesOutput(Collection<Transformation> transformations, String uri) {
        super(transformations, uri);
        this.sections = new ArrayList<>();
        sections.add(new JsonASTAddSectionOutput());
        sections.add(new JsonASTReplaceSectionOutput());
        sections.add(new JsonASTDeleteSectionOutput());
        sections.add(new JsonASTFailuresSectionOutput());
    }
}
