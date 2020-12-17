package com.thekotlinjavaway.exceptions;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //new Main().uncheckedExceptionRuntime();
        //new Main().uncheckedExceptionError();

        new Main().writeList(Arrays.asList(1,2,3,4));
        new Main().writeListV2(Arrays.asList(1,2,3,4));

    }

    // Catch
    public void tryStatement() {
        try {
            throwExceptionReq(); // code that could throw an exception
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Specify Requirement
    public void throwExceptionReq() throws Exception {
        throw new Exception();
    }

    // Checked Exception
    public void checkedException() {
        // The FileReader constructor throws IOException, which must be caught.
        try {
            FileReader file = new FileReader("C:\\myFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // RuntimeException
    public void uncheckedExceptionRuntime() {
        Long number1 = null;
        number1.compareTo(3l); // NullPointerException
    }

    // Error
    public void uncheckedExceptionError() {
        uncheckedExceptionError();// StackOverflowError
    }


    public void writeList(List<Integer> list) {
        final int SIZE = 10;
        PrintWriter out = null;

        try {
            System.out.println("Entering" + " try statement");

            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public void writeListV2(List<Integer> list) {
        final int SIZE = 10;
        try (PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"))) {
            System.out.println("Entering" + " try statement");

            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException | IOException e) {
            System.err.println("Caught " + e.getClass() + ": " + e.getMessage());
        }
    }

    /*public void tryWithResourceTest() {
        try(String s = ""){

        }
    }*/

    public void writeListV3(List<Integer> list) throws IOException, IndexOutOfBoundsException/*unchecked*/ {
        final int SIZE = 10;
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }

    public static void uncheckedException(String args[]) {
        int x = 0;
        int y = 10;
        int z = y / x;
    }
}
