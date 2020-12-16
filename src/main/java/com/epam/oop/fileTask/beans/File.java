package com.epam.oop.fileTask.beans;

public class File<T> extends Metadata implements FileI<T>{
    T content;

    public File(String name) {
        super(name);
    }

    @Override
    public T getContent() {
        return content;
    }

    @Override
    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;
        if (!super.equals(o)) return false;

        File<?> file = (File<?>) o;

        return getContent() != null ? getContent().equals(file.getContent()) : file.getContent() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }
}
