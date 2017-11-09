package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{

        Scanner sf = new Scanner(new File("StudentScores.in"));
        int maxIndx = -1;
        String text[] = new String[100];

        while(sf.hasNext( )) {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
            System.out.println(text[maxIndx]);
        }

    }

}