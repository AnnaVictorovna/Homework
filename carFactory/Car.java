package by.carFactory;

import javax.swing.text.html.Option;
import java.util.List;

public class Car {
    private CarBrand carBrand;
    private WheelSize wheelSize;
    private CarColor carColor;
    private Engine engine;
    private List<Option> listOfOptions;

    public Car(CarBrand carBrand, WheelSize wheelSize, CarColor carColor, Engine engine, List<Option> listOfOptions) {
        this.carBrand = carBrand;
        this.wheelSize = wheelSize;
        this.carColor = carColor;
        this.engine = engine;
        this.listOfOptions = listOfOptions;
    }

    public String getCarBrand() {
        return this.carBrand.getModelName();
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Option> getListOfOptions() {
        return listOfOptions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand=" + carBrand +
                ", wheelSize=" + wheelSize +
                ", carColor=" + carColor +
                ", engine=" + engine +
                ", listOfOptions=" + listOfOptions +
                '}';
    }
}



