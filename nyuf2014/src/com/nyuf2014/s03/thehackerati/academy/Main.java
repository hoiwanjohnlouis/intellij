package com.nyuf2014.s03.thehackerati.academy;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        processFiles2();
    }

    public static void processFiles2() throws Exception {
        String homeDir = System.getProperty("user.home");
        File myFile = new File(homeDir + File.separator + "MyApp.log");
        System.out.println(myFile);
    }
    public static void processFiles1() throws Exception {
        File myFile = new File("RobMa.txt");
        //System.out.println(myFile.getAbsoluteFile());
        DataOutputStream output =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(myFile)));
        System.out.println(myFile.getAbsoluteFile());
        output.writeBytes("Here's the value of pi: \n");
        output.writeDouble(3.14159);
        output.writeBytes("We are done!\n");
        output.close();

        DataInputStream input =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(myFile)));
        System.out.println(input.readLine());
        System.out.println(input.readDouble());
        System.out.println(input.readLine());
        input.close();

        PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
        System.out.println(myFile.getAbsoluteFile());
        pwriter.println("Here's the value of pi:\n");
        pwriter.println(3.14159);
        pwriter.println("We are done!");
        pwriter.close();

        BufferedReader preader = null;
        try {
            preader = new BufferedReader(new FileReader(myFile));
            System.out.println(myFile.getAbsoluteFile());
            System.out.println(preader.readLine());
            double piValue = Double.parseDouble(preader.readLine());
            System.out.println(piValue);
            System.out.println(preader.readLine());
        } catch (NumberFormatException ex1) {
            System.out.println(ex1);
        } catch (NullPointerException ex2) {
            System.out.println(ex2);
        } catch (FileNotFoundException ex3) {
            System.out.println(ex3);
        } finally {
            if (preader != null) {
                preader.close();
            }
        }
    }

    public static void processShapes() throws Exception {
        ArrayList<IShape> shapes = new ArrayList<IShape>();
        IShape aCircle = new Circle(2.0);
        shapes.add(aCircle);
        IShape aSquare = new Square(2.0);
        shapes.add(aSquare);
        IShape aRTriangle = new RTriangle(2.0, 2.0);
        shapes.add(aRTriangle);

        for (IShape ss : shapes) {
            System.out.println(ss);
            try {
                ss.foo();
            } catch (Exception ex) {
                //System.out.println(ex);
                throw ex;
            } finally {
                System.out.println("Hello!");
            }
        }
    }
}
