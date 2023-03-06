package by.vvod.vvod_vyvod.Homework_9_10;

import java.io.*;


public class Homework_9 {
    private static final String FILE_NAME = "F:\\Zhernokleva\\Lis\\src\\by\\vvod\\vvod_vyvod\\Homework_9_10\\File";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream cos = new ObjectOutputStream(fos);
        
        cos.writeObject(new Boxx(1, 2, 3));
        cos.writeObject(new Boxx(1, 2, 3));
        cos.writeObject(new Boxx(1, 2, 3));
        cos.writeObject(new Boxx(1, 2, 3));
        cos.writeObject(new Boxx(1, 2, 3));
        cos.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Boxx box = (Boxx) ois.readObject();
        ois.close();
        System.out.println(box);
    }
}

