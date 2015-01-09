package fr.inria.diversify.persistence.json;

import fr.inria.diversify.persistence.SectionOuput;
import fr.inria.diversify.transformation.Transformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonSosieOutput extends JsonTransformationOutput {

    public JsonSosieOutput(List<SectionOuput> sections, String uri, Collection<Transformation> transformations) {
        super(sections, uri, transformations);
    }

    public JsonSosieOutput(Collection<Transformation> transformations, String uri) {
        super(transformations, uri);
        this.sections = new ArrayList<>();
        sections.add(new JsonASTAddSectionOutput());
        sections.add(new JsonASTReplaceSectionOutput());
        sections.add(new JsonASTDeleteSectionOutput());
        sections.add(new JsonASTFailuresSectionOutput());
    }
}
