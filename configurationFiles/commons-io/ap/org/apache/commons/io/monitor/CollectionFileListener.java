package org.apache.commons.io.monitor;

import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import java.io.Serializable;

/** 
 * {@link FileAlterationListener} implementation that adds created, changed and deleted
 * files/directories to a set of {@link Collection}s.
 */
public class CollectionFileListener implements Serializable , FileAlterationListener {
    private final boolean clearOnStart;

    private final Collection<java.io.File> createdFiles = new ArrayList<java.io.File>();

    private final Collection<java.io.File> changedFiles = new ArrayList<java.io.File>();

    private final Collection<java.io.File> deletedFiles = new ArrayList<java.io.File>();

    private final Collection<java.io.File> createdDirectories = new ArrayList<java.io.File>();

    private final Collection<java.io.File> changedDirectories = new ArrayList<java.io.File>();

    private final Collection<java.io.File> deletedDirectories = new ArrayList<java.io.File>();

    /** 
     * Create a new observer.
     * 
     * @param clearOnStart true if clear() should be called by onStart().
     */
public CollectionFileListener(boolean clearOnStart) {
        this.clearOnStart = clearOnStart;
    }

    /** 
     * File system observer started checking event.
     * 
     * @param observer The file system observer
     */
public void onStart(final FileAlterationObserver observer) {
        if (clearOnStart) {
            clear();
        } 
    }

    /** 
     * Clear file collections.
     */
public void clear() {
        createdFiles.clear();
        changedFiles.clear();
        deletedFiles.clear();
        createdDirectories.clear();
        changedDirectories.clear();
        deletedDirectories.clear();
    }

    /** 
     * Return the set of changed directories.
     * 
     * @return Directories which have changed
     */
public Collection<java.io.File> getChangedDirectories() {
        return changedDirectories;
    }

    /** 
     * Return the set of changed files.
     * 
     * @return Files which have changed
     */
public Collection<java.io.File> getChangedFiles() {
        return changedFiles;
    }

    /** 
     * Return the set of created directories.
     * 
     * @return Directories which have been created
     */
public Collection<java.io.File> getCreatedDirectories() {
        return createdDirectories;
    }

    /** 
     * Return the set of created files.
     * 
     * @return Files which have been created
     */
public Collection<java.io.File> getCreatedFiles() {
        return createdFiles;
    }

    /** 
     * Return the set of deleted directories.
     * 
     * @return Directories which been deleted
     */
public Collection<java.io.File> getDeletedDirectories() {
        return deletedDirectories;
    }

    /** 
     * Return the set of deleted files.
     * 
     * @return Files which been deleted
     */
public Collection<java.io.File> getDeletedFiles() {
        return deletedFiles;
    }

    /** 
     * Directory created Event.
     * 
     * @param directory The directory created
     */
public void onDirectoryCreate(final File directory) {
        createdDirectories.add(directory);
    }

    /** 
     * Directory changed Event.
     * 
     * @param directory The directory changed
     */
public void onDirectoryChange(final File directory) {
        changedDirectories.add(directory);
    }

    /** 
     * Directory deleted Event.
     * 
     * @param directory The directory deleted
     */
public void onDirectoryDelete(final File directory) {
        deletedDirectories.add(directory);
    }

    /** 
     * File created Event.
     * 
     * @param file The file created
     */
public void onFileCreate(final File file) {
        createdFiles.add(file);
    }

    /** 
     * File changed Event.
     * 
     * @param file The file changed
     */
public void onFileChange(final File file) {
        changedFiles.add(file);
    }

    /** 
     * File deleted Event.
     * 
     * @param file The file deleted
     */
public void onFileDelete(final File file) {
        deletedFiles.add(file);
    }

    /** 
     * File system observer finished checking event.
     * 
     * @param observer The file system observer
     */
public void onStop(final FileAlterationObserver observer) {
    }
}

