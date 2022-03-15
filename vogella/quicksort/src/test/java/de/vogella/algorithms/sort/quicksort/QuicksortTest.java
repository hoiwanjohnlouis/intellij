package de.vogella.algorithms.sort.quicksort;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class QuicksortTest {

    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 7919; // 20;

    @BeforeEach
    void setup() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0, j = numbers.length; i < j; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    public void testNull() {
        Quicksort sorter = new Quicksort();
        sorter.sort(null);
    }

    @Test
    public void testEmpty() {
        Quicksort sorter = new Quicksort();
        sorter.sort(new int[0]);
    }

    @Test
    public void testSimpleElement() {
        Quicksort sorter = new Quicksort();
        int[] test = new int[1];
        test[0] = 5;
        sorter.sort(test);
    }

    @Test
    public void testSpecial() {
        Quicksort sorter = new Quicksort();
        int[] test = {5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5};
        sorter.sort(test);
        if (!validate(test)) {
            fail("Should not happen");
        }
        printResults(test);
    }

    @Test
    public void testQuicksort() {
        Quicksort sorter = new Quicksort();
        long startTime = System.currentTimeMillis();
        sorter.sort(numbers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Standard Java Sort Time in millis= " + elapsedTime);
        if (!validate(numbers)) {
            fail("Should not happen");
        }
        printResults(numbers);
        assertTrue(true);
    }

    @Test
    public void testRegularSort() {
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Standard Java Sort Time in millis= " + elapsedTime);
        if (!validate(numbers)) {
            fail("Should not happen");
        }
        printResults(numbers);
        assertTrue(true);
    }

    private boolean validate (int[] numbers) {
        for (int i = 0, j = numbers.length; i < j; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void printResults(int[] numbers) {
        for (int i = 0, j = numbers.length; i < j; i++) {
            System.out.print(numbers[i]);
        }
    }


    public static void main (String args[]) {
        System.out.println("Hello World");
    }

}