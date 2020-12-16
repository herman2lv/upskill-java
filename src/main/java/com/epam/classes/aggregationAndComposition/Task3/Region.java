package com.epam.classes.aggregationAndComposition.Task3;

import java.util.List;

public class Region {
    private String name;
    private City regionCenter;
    private final List<District> districts;

    public Region(String name, City regionCenter, List<District> districts) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.districts = districts;
    }

    public int getArea() {
        return districts.stream().mapToInt(District::getArea).sum();
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }
}
