package by.newCarFactory;

import java.util.List;

public class CarFactory <T>{
    private List<CarBrand> carBrands;
    private List<Engine> engines;
    private List<CarColor> carColors;
    private List<WheelSize> wheelSizes;
    private FactoryStock factoryStock;

    public CarFactory(List<CarBrand> carBrands, List<Engine> engines, List<CarColor> carColors, List<WheelSize> wheelSizes, FactoryStock factoryStock) {
        this.carBrands = carBrands;
        this.engines = engines;
        this.carColors = carColors;
        this.wheelSizes = wheelSizes;
        this.factoryStock = factoryStock;
    }
    public <T> void showWorkShopCatalogue(List<T> catalogue) {}
    public <T> void createCar(){}
    public <T> void checkCarInTheStock() {}
    public <T> void chooseMoreSutibleCar(){}
    public <T> void replaceInappropriateParametrs() {}


}
