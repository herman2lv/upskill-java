package com.epam.algorithmization.decomposition;

public class Task4 {
    public static void main(String[] args) {
// the first way - if we store coordinates in a 2d array ({x1, x2, ...}, {y1, y2, ...}})
        double[][] coordinates2dArray = {{0.0, 1.0, -1.0, 4.0}, {0.0, 1.0, -1.0, 0.0}};
        Service.printMaxDistantPoints2dArray(coordinates2dArray);
// the second way - if we store coordinates in a 1d array ({x1, y1, x2, y2, ...})
        double[] coordinates1dArray = {0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 4.0, 0.0};
        Service.printMaxDistantPoints1dArray(coordinates1dArray);
    }
}
