package com.epam.oop.files.services;

import com.epam.oop.files.beans.Directory;
import com.epam.oop.files.beans.DirectoryI;
import com.epam.oop.files.beans.MetadataI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storage {
    private static final DirectoryI ROOT_DIR = new Directory("");
    private static final String ANY_CHARS = ".*";
    private static final String ANY_CHARS_BETWEEN_SLASHES = "/.*/";
    private static final String SPECIAL_CHARS = ".*[|/*:'?\"].*";
    private static final String PATH_OF_ROOT_DIR = "/";

    private Map<String, MetadataI> storage = new HashMap<>();

    {
        storage.put(PATH_OF_ROOT_DIR, ROOT_DIR);
    }

    public Map<String, MetadataI> getStorage() {
        return storage;
    }

    public void addObject(String path, MetadataI object) {
        if (!path.equals(PATH_OF_ROOT_DIR)) {
            checkName(path);
        }
        object.setParentDir(path);
        addToDir(path, object);
        path = path + "/" + object.getName();
        storage.put(path, object);
    }

    private void addToDir(String path, MetadataI object) {
        Directory directory = (Directory) storage.get(path);
        directory.getInnerObjects().add(object);
    }

    public void removeObject(String fullName) {
        MetadataI objectToRemove = storage.get(fullName);
        Directory parentDir = (Directory) storage.get(objectToRemove.getParentDir());
        parentDir.getInnerObjects().remove(objectToRemove);
        storage.remove(fullName);
        removeInnerObjects(fullName);
    }

    private void removeInnerObjects(String path) {
        Set<String> paths = getInnerObjectsPaths(path);
        for (String element : paths) {
            storage.remove(element);
        }
    }

    private Set<String> getInnerObjectsPaths(String path) {
        Set<String> keys = storage.keySet();
        Set<String> result = new HashSet<>();
        for (String key : keys) {
            if (key.matches(path + ANY_CHARS)) {
                result.add(key);
            }
        }
        return result;
    }

    public void rename(String oldFullName, String newShortName) {
        checkName(newShortName);
        MetadataI objectToRename = storage.get(oldFullName);
        storage.remove(oldFullName);
        objectToRename.setName(newShortName);
        String path = objectToRename.getParentDir() + "/" + objectToRename.getName();
        storage.put(path, objectToRename);
        if (objectToRename instanceof Directory) {
            Set<String> paths = getInnerObjectsPaths(oldFullName);
            for (String element : paths) {
                String newPath = element.replaceFirst(oldFullName, path);
                MetadataI object = storage.get(element);
                object.setParentDir(object.getParentDir().replaceFirst(oldFullName, path));
                storage.remove(element);
                storage.put(newPath, object);
            }
        }
    }

    public MetadataI getFile(String fullName) {
        return storage.get(fullName);
    }

    private void checkName(String name) {
        name = name.replaceAll(ANY_CHARS_BETWEEN_SLASHES, "");
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name can't end with \"/\" or contain only whitespace characters");
        } else if (name.matches(SPECIAL_CHARS)) {
            throw new IllegalArgumentException("Filename can't contain any of these characters \"| / * : ' ? \"\"");
        }
    }

}
