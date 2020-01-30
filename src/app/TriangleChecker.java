package app;

import model.Triangle;

class TriangleChecker {

   boolean checkIfRightTriangle(Triangle triangle){
        if (triangle.getAngleAB() == 90) return true;
        else if (triangle.getAngleAC() == 90) return true;
        else if(triangle.getAngleCB() == 90) return true;
        else return false;
    }
}
