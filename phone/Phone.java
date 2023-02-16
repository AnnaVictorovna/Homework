package by.phone;

public class Phone {
    private int number;
    private String model;
    private int weight;
    private String personName;
    private int personNumber;
    private String name;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void print() {
        System.out.println("Number: " + number + ", Model: " + model + ", Weight: " + weight);
    }

    public void receiveCall(String name) {
        this.name = name;
        System.out.println("Звонит {" + name + "}");
    }

    public void receiveCall(String personName, int personNumber) {
        this.personNumber = personNumber;
        this.personName = personName;
    }

    public void sendMessage(int... array) {
        for (int a : array) {
            System.out.println(a + " ");
        }
    }
}
