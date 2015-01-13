package fr.inria.diversify.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * The input section locator locate section input objects that can handle a given section of the storage
 *
 * Created by marodrig on 09/01/2015.
 */
public class InputSectionLocator {

    private Collection<SectionInput> sections;

    public Collection<SectionInput> locate(String sectionName) {
        return getSections().stream().filter(si -> si.canHandleSection(sectionName)).collect(Collectors.toList());
    }

    public void addSection(SectionInput section) {
        if ( !getSections().contains(section) ) {
            getSections().add(section);
        }
    }

    protected Collection<SectionInput> getSections() {
        if ( sections == null ) sections = new ArrayList<>();
        return sections;
    }
}
