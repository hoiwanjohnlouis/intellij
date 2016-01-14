package com.hwtechservicesllc.javarevisited.csvreaderinjava;

/**
 * Simple Java program to read CSV file in Java. In this program we will read
 * list of books stored in CSV file as comma separated values.
 * @author WINDOWS 8
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String... args) {

        List<Book> books = readBooksFromCSV("\\devProjects\\Idea\\javarevisited\\CSVReaderInJava\\res\\books.txt");

        // let's print all the person read from CSV file.
        for (Book b : books) {
            System.out.println(b);
        }

    }

    private static List<Book> readBooksFromCSV(String fileName) {

        List<Book> books = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            // read the first line from the text file.
            String line = br.readLine();

            // loop until all lines are read.
            while (line != null) {

                // use string.split to load a string array
                // with the values from each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                Book book = createBook(attributes);

                // adding book into ArrayList.
                books.add(book);

                // read next line before looping
                // if end of file reached, line will be null.
                line = br.readLine();

            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return books;
    }

    private static Book createBook(String[] metadata) {
        String name = metadata[0];
        int price = Integer.parseInt(metadata[1]);
        String author = metadata[2];

        // create and return book of this metadata.
        return new Book(name, price, author);
    }
}