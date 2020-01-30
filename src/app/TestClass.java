package app;

import model.Triangle;

public class TestClass {
    public static void main(String[] args) {
        TriangleChecker triangleChecker = new TriangleChecker();

        Triangle firstTriangle = new Triangle(1, 2, 3, 90, 60, 30);
        Triangle secondTriangle = new Triangle(2,3,4,10,100, 70);

        if(triangleChecker.checkIfRightTriangle(firstTriangle)) System.out.println("Trójkąt jest prostokątny");
        else System.out.println("Trójkąt nie jest prostokątny");
        if(triangleChecker.checkIfRightTriangle(secondTriangle)) System.out.println("Trójkąt jest prostokątny");
        else System.out.println("Trójkąt nie jest prostokątny");
    }
}
