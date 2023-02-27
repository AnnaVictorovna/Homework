package by.newCarFactory;

public enum Engine {
    ENGINE1("V6TFSI"),
    ENGINE2("8E2"),
    ENGINE3("T6AWD"),
    ;
    String engineName;
    int engineVolume;

    Engine(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }

}
