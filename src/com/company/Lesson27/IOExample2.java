package com.company.Lesson27;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class IOExample2 {

    public static void byteIn(){
        byte[]bytes = new byte[]{23,34,21,66};
        try(InputStream in = new ByteArrayInputStream(bytes);
            OutputStream out = new FileOutputStream("bytes.txt");) {
            byte[] buff = new byte[1024];
            int count;
            while ((count = in.read(buff)) != -1) {
                out.write(buff, 0, count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void streamUrl(){
        try(InputStream in = new URL("https://logbook.itstep.org/").openStream();
            OutputStream out = new FileOutputStream("index.html");){
            byte[]bytes = new byte[1024];
            int count;
            while ((count = in.read(bytes)) !=-1){
                out.write(bytes, 0, count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void bufferIO(){
        try(BufferedInputStream in =
                    new BufferedInputStream(new FileInputStream("index.txt"), 1024);) {
            byte[] bytes = new byte[6];
            in.mark(100);
            in.read(bytes);
            System.out.println("bytes = " + Arrays.toString(bytes) +", "+ new String(bytes));
            in.read(bytes);
            System.out.println("bytes = " + Arrays.toString(bytes) +", "+ new String(bytes));
            //in.mark(1);
            in.read(bytes);
            System.out.println("bytes = " + Arrays.toString(bytes) +", "+ new String(bytes));
            in.reset();
            in.read(bytes);
            System.out.println("bytes = " + Arrays.toString(bytes) +", "+ new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void charIO(){
        try(Reader reader = new FileReader("index.txt"); BufferedReader br =
                new BufferedReader(reader, 1024);) {
//         char[]chars = new char[256];
//         int count;
//            while ((count = reader.read(chars)) != -1) {
//                String str = new String(chars, 0, count);
//                System.out.println("str = " + str);
//            }
            String s = br.readLine();

            System.out.println("s = " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void charWriter() throws IOException {
        Writer writer = new FileWriter("out.txt");
        writer.write("Hello from writer");
        writer.close();
    }


    public static void scannerIO(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("index.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(scanner.nextLine());
        scanner.close();
    }

    public static void printIO() throws FileNotFoundException {
        PrintStream printStream = new PrintStream("file.txt");
        printStream.println("Hello from printStream");
        printStream.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        //streamUrl();
        //byteIn();
        //bufferIO();
        //charIO();
//        try {
//            charWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //scannerIO();
        printIO();
    }
}
