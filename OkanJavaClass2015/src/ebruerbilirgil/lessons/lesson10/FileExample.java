/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebruerbilirgil.lessons.lesson10;

import java.io.*;


public class FileExample {
    
    
    
    public static void main(String[] args)throws IOException {
        String[] bookStore={"Book1","Book2","Book3"};
        
        File file=new File("file1.txt");
        
        file.createNewFile();
        
        FileWriter fr=new FileWriter(file);
        
        PrintWriter pw=new PrintWriter(fr);
        
        for (String s:bookStore)
              pw.println(s);
        pw.close();
    }
}
