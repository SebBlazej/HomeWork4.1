package model;

public class Triangle {

    private final int sideALenght;
    private final int sideBLenght;
    private final int sideCLenght;
    private final int angleAB;
    private final int angleAC;
    private final int angleCB;

    public Triangle(int sideALenght, int sideBLenght, int sideCLenght, int angleAB, int angleAC, int angleCB){
        this.sideALenght = sideALenght;
        this.sideBLenght = sideBLenght;
        this.sideCLenght = sideCLenght;
        this.angleAB = angleAB;
        this.angleAC = angleAC;
        this.angleCB = angleCB;
    }

    public int getAngleAB() {
        return angleAB;
    }

    public int getAngleAC() {
        return angleAC;
    }

    public int getAngleCB() {
        return angleCB;
    }
}
