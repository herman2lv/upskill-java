package com.epam.oop.fileTask.beans;

import java.util.HashSet;
import java.util.Set;

public class Directory extends Metadata implements DirectoryI {
    Set<MetadataI> innerObjects = new HashSet<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public Set<MetadataI> getInnerObjects() {
        return innerObjects;
    }

    @Override
    public void setInnerObjects(Set<MetadataI> innerObjects) {
        this.innerObjects = innerObjects;
    }
}
