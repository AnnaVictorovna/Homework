package by.newCarFactory;

public enum CarBrand {
    BMW("BMW"),
    AUDI("AUDI"),
    KIA("KIA"),
    NISSAN("NISSAN"),
    ;
    String modelName;


    CarBrand(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

}

