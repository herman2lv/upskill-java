package com.epam.oop.files.beans;

import java.util.Set;

public interface DirectoryI extends MetadataI {
    Set<MetadataI> getInnerObjects();
    void setInnerObjects(Set<MetadataI> innerObjects);
}
