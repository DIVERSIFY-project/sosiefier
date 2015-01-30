package fr.inria.diversify.codeFragmentProcessor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

/**
 * A listener to know the progress of the processor
 *
 * Created by marodrig on 29/01/2015.
 */
public interface ProcessListener extends EventListener {
    /**
     * Invoked when an action occurs.
     *
     */
    public void actionPerformed(ActionEvent e);
}
