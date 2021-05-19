package com.company.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data {

    public static ArrayList<String> readingInputShapes() {
        ArrayList<String > list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String nextLine = br.readLine();
            while (nextLine != null) {
                list.add(nextLine);
                nextLine = br.readLine();
            }
            br.close();
        } catch (IOException ignore) {}
        return list;
    }
}