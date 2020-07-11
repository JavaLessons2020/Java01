package com.company.Lesson26.JavaIO;

import java.io.*;

public class IOExample {
    private static void inStream() {
        try {
            InputStream in = new FileInputStream("src/com/company/Lesson26/index.txt");
            byte[] bytes = new byte[256];
            //byte[] bytes = new byte[in.available()];//не рекомендую!!!!
            int count;
            //in.skip(5);
            while ((count = in.read(bytes)) != -1) {
                String str = new String(bytes, 0, count, "utf8");
                System.out.println("str = " + str);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outStream() {
//        OutputStream out = null;
//        try {
//            out = new FileOutputStream("src/com/company/Lesson26/index.txt");
//            String str = "Hello from Out New";
//            out.write(str.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try (OutputStream out = new FileOutputStream("index.txt");){
            String str = "Hello from Out New";
            out.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //inStream();


    }
}
