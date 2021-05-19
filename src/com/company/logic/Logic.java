package com.company.logic;

import com.company.data.Data;

import java.util.ArrayList;

public class Logic {
    ArrayList<Shape> listShapes = new ArrayList<>();

    public void logic (){
        ArrayList<String> listData = Data.reading();

        for (int i = 0; i < listData.size(); i++) {
            String splitArr[] = listData.get(i).split(" ");

            if (splitArr[0].equals("S")) {
                listShapes.add(new Square((int) Float.parseFloat(splitArr[1])));
            };
            if (splitArr[0].equals("R")) {
                listShapes.add(new Rectangle((int) Float.parseFloat(splitArr[1]), (int) Float.parseFloat(splitArr[2])));
            };
            if (splitArr[0].equals("C")) {
                listShapes.add(new Circle((int) Float.parseFloat(splitArr[1])));
            };
        }
    }

   public float perimeter() {
       int count = 0;
       int suma = 0;
       for (Shape shape : listShapes) {
           suma+=shape.calculatePerimeter();
           count++;
       }
       return (float) suma / count;
   }

    public float content() {
        int count = 0;
        int suma = 0;
        for (Shape shape : listShapes) {
            suma+=shape.calculateContent();
            count++;
        }
        return (float) suma / count;
    }
}
