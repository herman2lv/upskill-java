package com.epam.oop.fileTask.beans;

import java.util.Set;

public interface DirectoryI extends MetadataI {
    Set<MetadataI> getInnerObjects();
    void setInnerObjects(Set<MetadataI> innerObjects);
}
