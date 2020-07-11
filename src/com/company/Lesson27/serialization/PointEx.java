package com.company.Lesson27.serialization;

import java.io.*;
import java.time.LocalDate;

public class PointEx {
    int x;
    int y;

    public static void dataOut(PointEx point) {
        try (OutputStream out = new FileOutputStream("point.txt")) {
            DataOutput dataOutput = new DataOutputStream(out);
            dataOutput.writeInt(point.x);
            dataOutput.writeInt(point.y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dataIn(PointEx point) {
        try (InputStream in = new FileInputStream("point.dat")) {
        DataInput dataInput = new DataInputStream(in);
            point.x = dataInput.readInt();
            point.y = dataInput.readInt();
            System.out.println("Read point = " + point);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "PointEx{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        PointEx point = new PointEx();
        point.x = 10;
        point.y = 20;
        System.out.println("point = " + point);
        PointEx.dataOut(point);
        point.x = 100;
        point.y = 200;
        System.out.println("point = " + point);
        PointEx.dataIn(point);
        System.out.println("point = " + point);


    }
}