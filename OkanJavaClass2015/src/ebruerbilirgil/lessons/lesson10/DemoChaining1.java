/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebruerbilirgil.lessons.lesson10;

import java.io.*;

/**
 *
 * @author User
 */
public class DemoChaining1 {

    public static void main(String[] args) {
        String s = "";
        try {

            File file = new File("file1.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while ((s = bf.readLine()) != null) {
                System.out.println("s");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
