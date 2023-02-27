package by.newCarFactory;

public enum CarColor {
    BLUE("blue"),
    RED("red"),
    BLACK("black"),
    WHITE("white"),
    ;
    String colorName;

    CarColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
