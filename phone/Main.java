package by.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(2231212, "Samsung", 213);
        Phone phone2 = new Phone(4545897, "Xiaomi", 198);
        Phone phone3= new Phone(3678227, "Nokia", 216);
        phone1.print();
        phone2.print();
        phone3.print();
        phone1.receiveCall("Саша");
        phone1.getNumber();
        phone1.receiveCall("Anna", 3657662);
        phone1.sendMessage(122334, 334442, 556644);
    }
}
