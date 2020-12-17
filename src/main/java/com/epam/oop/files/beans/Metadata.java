package com.epam.oop.files.beans;

class Metadata implements MetadataI{
    String name;
    String parentDir;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getParentDir() {
        return parentDir;
    }

    @Override
    public void setParentDir(String parentDir) {
        this.parentDir = parentDir;
    }

    public Metadata(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Metadata)) return false;

        Metadata metadata = (Metadata) o;

        if (getName() != null ? !getName().equals(metadata.getName()) : metadata.getName() != null) return false;
        return getParentDir() != null ? getParentDir().equals(metadata.getParentDir()) : metadata.getParentDir() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getParentDir() != null ? getParentDir().hashCode() : 0);
        return result;
    }
}
