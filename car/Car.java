package by.car;

public class Car {
private Model model;
private WheelSize wheelSize;
private Color color;
private int year;
private int engineCapacity;

    public Car(Model model, WheelSize wheelSize, Color color, int year, int engineCapacity) {
        this.model = model;
        this.wheelSize = wheelSize;
        this.color = color;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

}
