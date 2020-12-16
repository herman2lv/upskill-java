package com.epam.oop.fileTask.beans;

public interface FileI<T> extends MetadataI{
    T getContent();
    void setContent(T content);
}
