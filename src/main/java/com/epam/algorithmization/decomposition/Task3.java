package com.epam.algorithmization.decomposition;

import static com.epam.algorithmization.decomposition.Service.getAreaOfHexagon;

public class Task3 {
    public static void main (String[] args) {
        Service service = new Service();
        double side;
        do {
            System.out.print("\nPlease, enter the hexagon's side");
            side = service.getDoubleFomConsole();
            if (side <= 0) {
                System.out.print("The number should be positive");
            }
        } while (side <= 0);
        double area = getAreaOfHexagon(side);
        System.out.printf("The area of the hexagon with the side of %.2fcm is %fcm²", side, area);
    }
}