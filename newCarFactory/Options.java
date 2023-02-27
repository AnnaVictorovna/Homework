package by.newCarFactory;

public enum Options {
    CONDITIONER("conditioner"),
    WARM("warm"),
    MUSIC("music"),
    ;
    String optionName;

    Options(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionName() {
        return optionName;
    }
}
