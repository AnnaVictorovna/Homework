package by.vvod.vvod_vyvod.Homework_9_and_10;

import java.io.Serializable;

public class Boxx implements Serializable {
    private int x;
    private int y;
    private int z;

    public Boxx(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public int volume() {
        return this.x * this.y * this.z;
    }

    @Override
    public String toString() {
        return "Boxx{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
