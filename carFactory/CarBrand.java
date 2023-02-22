package by.carFactory;

public enum CarBrand {
    BMW("BMW", 2015),
    AUDI("AUDI", 2019),
    KIA("KIA", 2007),
    NISSAN("NISSAN", 2010),
    ;
    String modelName;
    int issueYear;

    CarBrand(String modelName, int issueYear) {
        this.modelName = modelName;
        this.issueYear = issueYear;
    }

    public String getModelName() {
        return modelName;
    }

    public int getIssueYear() {
        return issueYear;
    }
}

