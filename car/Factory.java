package by.car;

public class Factory {
    public static void main(String[] args) {
        Car car1 = new Car(Model.BMW,WheelSize.AVERAGE,Color.RED,2017,11800);
        Car car2 = new Car(Model.NISSAN,WheelSize.BIG,Color.BLACK,2014,16500);
        Car car3 = new Car(Model.KIA,WheelSize.LITTLE,Color.ORANGE,2008,27000);
        Car [] sklad = {car1,car2,car3};
    }
}
