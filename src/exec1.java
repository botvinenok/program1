package com.TestSoft;

import java.io.*;

public class exec1 {
    public static void main(String[] args) {

        int symbol;
        int intermedValue = 0;
        int maxValue = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt")))
        {
            while ((symbol = reader.read()) != -1) {
                if('1' == (char)symbol){
                    intermedValue += 1;
                } else {
                    intermedValue = 0;
                }
                if (intermedValue > maxValue){
                    maxValue = intermedValue;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e ) {
            e.printStackTrace();
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
        {
            String line = "";
            int i = 0;
            while ( i++ < maxValue){
                line += "1";
            }
            writer.write(line);
            System.out.println(maxValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



