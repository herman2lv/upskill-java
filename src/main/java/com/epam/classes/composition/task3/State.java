package com.epam.classes.composition.task3;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private City capital;
    private final List<Region> regions;

    public State(String name, City capital, List<Region> regions) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public String getCapitalName() {
        return capital.toString();
    }

    public int getNumberOfRegions() {
        return regions.size();
    }

    public int getArea() {
        return regions.stream().mapToInt(Region::getArea).sum();
    }

    public List<City> getRegionCenters() {
        List<City> regionCenters = new ArrayList<>();
        for (Region region: regions) {
            regionCenters.add(region.getRegionCenter());
        }
        return regionCenters;
    }
}
