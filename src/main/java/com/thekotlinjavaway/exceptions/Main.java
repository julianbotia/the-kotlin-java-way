package com.thekotlinjavaway.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

    }

    public void testee(){
        throw new Throwable();
    }

    // Specify Requirement
    public void throwAnyException2() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Catch
    public void throwAnyException() throws Exception {
        throw new Exception();
    }

    public static void checkedException(String[] args)  {
        // The FileReader constructor throws IOException, which must be caught.
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) {
            // The readLine() method throws java.io.IOException, which must be caught.
            System.out.println(fileInput.readLine());
        }
        // The close() method throws java.io.IOException, which must be caught.
        fileInput.close(); // java.io.IOException
    }

    public void writeList() {
        // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        for (int i = 0; i < 10; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
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
