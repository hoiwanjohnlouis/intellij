package de.vogella.algorithms.sort.quicksort;

public class Quicksort {

    private int[] arrayOfIntegers;
    private int numberOfIntegers;

    public void sort(int[] values) {
            if (null == values || 0 == values.length) {
                return;
            }
            this.arrayOfIntegers = values;
            numberOfIntegers = values.length;
            quicksort(0, numberOfIntegers - 1);
    }

    private void quicksort(int low, int high) {
        int i = low;
        int j = high;

        int pivot = arrayOfIntegers[(low + (high - low)) / 2];

        while(i < j) {
            while(arrayOfIntegers[i] < pivot) {
                i++;
            }
            while(arrayOfIntegers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i , j);
                i++;
                j--;
            }

            // use recursion to sort remaining sub array
            if (low < j) {
                quicksort(low, j);
            }
            if (i < high) {
                quicksort(i, high);
            }
        }
    }

    private void exchange(int i, int j) {
        int temp = arrayOfIntegers[i];
        arrayOfIntegers[i] = arrayOfIntegers[j];
        arrayOfIntegers[j] = temp;
    }



    public static void main (String args[]) {
        System.out.println("Hello World");
    }
}
