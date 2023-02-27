package by.newCarFactory;

import javax.swing.text.html.Option;
import java.util.List;

public class Car {
    private CarBrand carBrand;
    private WheelSize wheelSize;
    private CarColor carColor;
    private Engine engine;
    private List<Option> listOfOptions;
    int issueYear;

    public Car(CarBrand carBrand, WheelSize wheelSize, CarColor carColor, Engine engine, List<Option> listOfOptions, int issueYear) {
        this.carBrand = carBrand;
        this.wheelSize = wheelSize;
        this.carColor = carColor;
        this.engine = engine;
        this.listOfOptions = listOfOptions;
        this.issueYear = issueYear;
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

    public void setListOfOptions(List<Option> listOfOptions) {
        this.listOfOptions = listOfOptions;
    }

    public int getIssueYear() {
        return issueYear;
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



