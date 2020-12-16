package com.epam.algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {
    public static int getGreatestCommonDivisor (int a, int b) {
        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        if (num2 == 0) {
            return num1;
        }
        int temp = num1 % num2;
        while (temp != 0) {
            num1 = num2;
            num2 = temp;
            temp = num1 % num2;
        }
        return num2;
    }
    public static int getLeastCommonMultiple (int a, int b) {
        return (a*b)/getGreatestCommonDivisor(a, b);
    }
    public static int getGreatestCommonDivisorForManyNums(int ... numbers) {
        int divisor = numbers[0];
        for (int element: numbers) {
                divisor = getGreatestCommonDivisor(divisor, element);
                if (divisor == 1) {
                    return divisor;
                }
        }
        return divisor;
    }
    public static double getAreaOfEquilateralTriangle(double side) {
        double result = Math.sqrt(3)/4.0*Math.pow(side, 2);
        return Math.round(result*10000)/10000.0;
    }
    public static double getAreaOfHexagon(double side) {
        return getAreaOfEquilateralTriangle(side)*6;
    }
    public double getDoubleFomConsole () {
        System.out.print("\nPlease, enter a value: ");
        double number;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Couldn't read entered data. Please, try again");
                continue;
            }
            break;
        }
        return number;
    }
    public static void printMaxDistantPoints1dArray (double[] coordinates) {
        double maxDistance = 0;
        int point1 = 1;
        int point2 = 2;
        for (int i = 0; i < coordinates.length - 3; i+=2) {
            for (int j = i+2; j < coordinates.length-1; j+=2) {
                double distance = getDistance(coordinates[i], coordinates[i+1], coordinates[j], coordinates[j+1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = (i+2)/2;
                    point2 = (j+2)/2;
                }
            }
        }
        System.out.printf("\nThe max distance (%f) is between points #%d (x%d = %f; y%d = %f) and #%d (x%d = %f; y%d = %f)\n",
                maxDistance,
                point1, point1, coordinates[2*point1-2], point1, coordinates[2*point1-1],
                point2, point2, coordinates[2*point2-2],point2, coordinates[2*point2-2]);
    }
    public static void printMaxDistantPoints2dArray (double[][] coordinates) {
        double maxDistance = 0;
        int point1 = 1;
        int point2 = 2;
        for (int i = 0; i < coordinates[0].length - 1; i++) {
            for (int j = i + 1; j < coordinates[0].length; j++) {
                double distance = getDistance(coordinates[0][i], coordinates[1][i], coordinates[0][j], coordinates[1][j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = i+1;
                    point2 = j+1;
                }
            }
        }
        System.out.printf("\nThe max distance (%f) is between points #%d (x%d = %f; y%d = %f) and #%d (x%d = %f; y%d = %f)\n",
                maxDistance,
                point1, point1, coordinates[0][point1-1], point1, coordinates[1][point1-1],
                point2, point2, coordinates[0][point2-1],point2, coordinates[1][point2-1]);
    }
    public static double getDistance (double x1, double y1, double x2, double y2) {
        double result = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return Math.round(result*10000)/10000.0;
    }
    public static int getSecondGreatestElement (int[] array) {
        int maxElement = array[0];
        int minElement = array[0];
        for (int element : array) {
            if (element > maxElement) {
                maxElement = element;
            } else if (element < minElement) {
                minElement = element;
            }
        }
        if (minElement == maxElement) {
            System.out.println("\nAll elements of the array has the same value");
            System.exit(1);
        }
        int secondGreatestElement = minElement;
        for (int element : array) {
            if (element > secondGreatestElement && element != maxElement) {
                secondGreatestElement = element;
            }
        }
        return secondGreatestElement;
    }
    public static boolean areCoprime (int a, int b, int c) {
        return getGreatestCommonDivisorForManyNums(a, b, c) == 1;
    }
    public static int getFactorial (int a) {
        if (a == 0) {
            return 1;
        }
        return a * getFactorial(a-1);
    }
    public static int getSumOfOddFactorials (int a) {
        int sum = 0;
        for (int i = 1; i <= a; i += 2) {
            sum += getFactorial(i);
        }
        return sum;
    }
    public static int getSumOfSequentArraysElements (int[] array, int position, int numberOfElements) {
        int sum = 0;
        for (int i = position-1; i < position-1 + numberOfElements; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Compute the area of of a rectangle with at least one right angle
     * @param side1 - side that adjacent to the right angle;
     * @param side2 - other side that adjacent to the right angle;
     * @param side3 - any other side;
     * @param side4 - any other side;
     * @return the area of a rectangle rounded to the 4 digits after point
     */
    public static double getAreaOfRectangleWithOneRightAngle (double side1, double side2, double side3, double side4) {
        double hypotenuse = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
        return getAreaOfRightTriangle(side1, side2) + getAreaOfTriangleBySides(side3, side4, hypotenuse);
    }
    public static double getAreaOfRightTriangle (double cathetus1, double cathetus2) {
        double result = cathetus1 * cathetus2 / 2;
        return Math.round(result*10000)/10000.0;
    }
    public static double getAreaOfTriangleBySides (double side1, double side2, double side3) {
        double semiperimeter = (side1 + side2 + side3)/2;
        double result = Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
        return Math.round(result*10000)/10000.0;
    }
    public static int compareNumbersByNumberOfDigits (int number1, int number2) {
        int digitsNumber1 = (String.valueOf(number1)).length();
        int digitsNumber2 = (String.valueOf(number2)).length();
        return digitsNumber1 - digitsNumber2;
    }
    public static int[] getArrayFromDigitsOfNumber (int number) {
        int[] array = new int[(String.valueOf(number)).length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }
    public static int getSumOfDigits (int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int getNumberOfSubtractionsOfSumsOfDigitsToReachZero (int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        while (number != 0) {
            number -= getSumOfDigits(number);
            counter++;
        }
        return counter;
    }
    public static int[] generateArrayWithCertainNumbers (int lengthOfArray, int sumOfDigits, int limit) {
        int[] array = new int[lengthOfArray];
        int i = 0;
        while (i < array.length) {
            for (int j = 1; j <= limit; j++) {
                if (countSumOfDigits(j) == sumOfDigits) {
                    array[i] = j;
                    i++;
                }
                if (i >= array.length) {
                    break;
                }
            }
            if (i == 0) {
                break;
            }
        }
        return array;
    }
    public static int[] getPrimeNumbers (int leftLimit, int rightLimit) {
        int[] primeNumbers = new int[rightLimit - leftLimit + 1];
        int index = 0;
        for (int i = leftLimit; i <= rightLimit; i++) {
            boolean isComposite = false;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (!isComposite) {
                primeNumbers[index] = i;
                index++;
            }
        }
        primeNumbers = getRidOfBlankValues(primeNumbers);
        return primeNumbers;
    }
    public static int[] getNumbersWithAscendingDigits (int numberOfDigits) {
        if (numberOfDigits > 9) {
            System.out.println("Max accepted number of digits is 9");
            System.exit(1);
        }
        int leftLimit = (int)Math.pow(10, numberOfDigits - 1);
        int rightLimit = leftLimit * 10 - 1;
        int[] array = new int[rightLimit - leftLimit];
        int index = 0;
        for (int i = leftLimit; i <= rightLimit; i++) {
            boolean isAscending = true;
            int[] digits = getArrayFromDigitsOfNumber(i);
            for (int j = 0; j < digits.length - 1; j++) {
                if (digits[j] >= digits[j + 1]) {
                    isAscending = false;
                    break;
                }
            }
            if (isAscending) {
                array[index] = i;
                index++;
            }
        }
        array = getRidOfBlankValues(array);
        return array;
    }
    public static int getSumOfNumbersWithOddDigits (int numberOfDigits) {
        if (numberOfDigits > 9) {
            System.out.println("Max accepted number of digits is 9");
            System.exit(1);
        }
        int leftLimit = (int)Math.pow(10, numberOfDigits - 1);
        int rightLimit = leftLimit * 10 - 1;
        int sum = 0;
        for (int i = leftLimit; i <= rightLimit; i++) {
            boolean digitsAreOdd = true;
            int[] digits = getArrayFromDigitsOfNumber(i);
            for (int digit : digits) {
                if (digit % 2 == 0) {
                    digitsAreOdd = false;
                    break;
                }
            }
            if (digitsAreOdd) {
                sum += i;
            }
        }
        return sum;
    }
    public static int getNumberOfEvenDigits (int number) {
        int[] digits = getArrayFromDigitsOfNumber(number);
        int count = 0;
        for (int digit : digits) {
            if (digit %2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int[] getArmstrongNumbers (int leftLimit, int rightLimit) {
        int[] armstrongNumbers = new int[1000];
        int index = 0;
        for (int i = leftLimit; i <= rightLimit; i++) {
            int sum = 0;
            for (int digit: getArrayFromDigitsOfNumber(i)) {
                sum += Math.pow(digit, (String.valueOf(i)).length());
            }
            if (sum == i) {
                armstrongNumbers[index] = i;
                index++;
            }
        }
        armstrongNumbers = getRidOfBlankValues(armstrongNumbers);
        return armstrongNumbers;
    }
    public static int[][] getTwinPrimeNumbers (int[] primeNumbers) {
        Arrays.sort(primeNumbers);
        int primeNumber = 0;
        int previousPrimeNumber;
        int index = 0;
        int[][] twinPrimeNumbers = new int[2][primeNumbers.length];
        for (int i = primeNumbers.length - 1; i >= 0; i--) {
            if (primeNumbers[i] == 0) {
                break;
            }
            previousPrimeNumber = primeNumber;
            primeNumber = primeNumbers[i];
            if (previousPrimeNumber == primeNumber + 2) {
                twinPrimeNumbers[0][index] = primeNumber;
                twinPrimeNumbers[1][index] = previousPrimeNumber;
                index++;
            }
        }
        index = 0;
        for (int i = 0; i < twinPrimeNumbers[0].length; i++) {
            if (twinPrimeNumbers[0][i] == 0) {
                index = i;
                break;
            }
        }
        int[][] twinPrimeNumbersFull = new int[2][index];
        System.arraycopy(twinPrimeNumbers[0], 0, twinPrimeNumbersFull[0], 0, index);
        System.arraycopy(twinPrimeNumbers[1], 0, twinPrimeNumbersFull[1], 0, index);
        return twinPrimeNumbersFull;
    }
    public static int[] getRidOfBlankValues (int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                index = i;
                break;
            }
        }
        int[] result = new int[index];
        System.arraycopy(array, 0, result, 0, index);
        return result;
    }
    public static void printTwinPrimeNumbers (int[][] twinPrimeNumbers) {
        for (int i = 0; i < twinPrimeNumbers[0].length; i++) {
            System.out.printf("Pair: %12d and %d\n", twinPrimeNumbers[0][i], twinPrimeNumbers[1][i]);
        }
    }
    public static int countSumOfDigits (int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
