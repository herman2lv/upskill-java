package com.epam.classes.composition.task3;

import java.util.List;

public class District {
    private String name;
    private City districtCenter;
    private final List<City> cities;
    private int area;

    public District(String name, City districtCenter, List<City> cities, int area) {
        this.name = name;
        this.districtCenter = districtCenter;
        this.cities = cities;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public List<City> getCities() {
        return cities;
    }
}
