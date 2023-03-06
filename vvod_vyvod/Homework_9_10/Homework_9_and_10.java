package by.vvod.vvod_vyvod.Homework_9_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Homework_9_and_10 {
    private static final String FILE_NAME = "F:\\Zhernokleva\\Lis\\src\\by\\vvod\\vvod_vyvod\\Homework_9_10\\File";
    private static final String NEW_FILE_FOR_THE_BIGGEST_VOLUME = "F:\\Zhernokleva\\Lis\\src\\by\\vvod\\vvod_vyvod\\Homework_9_10\\OUTPUT";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream cos = new ObjectOutputStream(fos);
        List<Boxx> list = new ArrayList<>();
        list.add(new Boxx(1, 2, 3));
        list.add(new Boxx(2, 4, 3));
        list.add(new Boxx(2, 4, 3));
        list.add(new Boxx(2, 4, 3));
        list.add(new Boxx(2, 4, 3));

        cos.writeObject(list);
        cos.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Boxx> box = (List<Boxx>) ois.readObject();
        ois.close();
        System.out.println(box);

        Boxx biggest = list.get(0);
        for (Boxx boxx : list) {
            if (biggest.volume() < boxx.volume()) {
                biggest = boxx;
                System.out.println(biggest);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(NEW_FILE_FOR_THE_BIGGEST_VOLUME);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(biggest);
        objectOutputStream.close();
    }
}