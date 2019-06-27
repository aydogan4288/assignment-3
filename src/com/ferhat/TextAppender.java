package com.ferhat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextAppender {

    public static void appending(){
        try(FileWriter fw = new FileWriter("myfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {

            out.println("the text");

            out.println("more text");

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());

        }
    }
}
