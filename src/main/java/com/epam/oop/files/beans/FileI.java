package com.epam.oop.files.beans;

public interface FileI<T> extends MetadataI{
    T getContent();
    void setContent(T content);
}
