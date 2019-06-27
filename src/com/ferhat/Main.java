package com.ferhat;

import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {


        // --------- Write a Java program to get a list of all file/directory names under a given directory. ---------

        File folder = new File("/Users/ferhat/Desktop/Coding1");
        String[] files = folder.list();
        for (String file : files) {
            System.out.println(file);
        }
        TextAppender ta = new TextAppender();
        ta.appending();


        //---------------- Char Counter -----------------

        String filename = args[0]; //file path
        char x = args[1].charAt(0);// char we are looking for
        String line = "";
        Scanner scanner = new Scanner(new FileReader(filename));
        int counter = 0;
        try {
                while(scanner.hasNextLine()){
                    line = scanner.nextLine();

                    for(int i=0; i < line.length(); i++){
                        if(line.charAt(i) == x){
                            counter++;
                        }
                    }
                }
        }
        finally {
            scanner.close();
        }
        System.out.print(counter);
    }
}

