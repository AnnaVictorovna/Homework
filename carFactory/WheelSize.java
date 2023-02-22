package by.carFactory;

public enum WheelSize {
    BIG(25),
    AVERAGE(20),
    LITTLE(15),
    ;
    private int wheelDiameter;

    WheelSize(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }
}