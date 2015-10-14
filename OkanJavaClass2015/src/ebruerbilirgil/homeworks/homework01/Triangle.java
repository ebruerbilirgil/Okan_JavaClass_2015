/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ebruerbilirgil.homeworks.homework01;

/**
 *
 * @author alikatkar
 */
public class Triangle {
    
     public static void main(String[] args) {
         
         // iç içe iki for döngüsü kullanarak aşağıdaki şekli ekrana basan
         // kodu yazın

         // *
         // **
         // ***
         // ****
         // *****
        
        for(int i = 1; i<=5; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
         
     }    
}
}
