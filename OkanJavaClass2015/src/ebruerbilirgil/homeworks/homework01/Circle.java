/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ebruerbilirgil.homeworks.homework01;

/**
 *
 * @author ebruerbilirgil
 */
public class Circle {
    
    public static void main(String[] args){
        
        // double tipinde PI değişkeni tanımlayın. ilk değeri 3.14159
        // double tipinde radius (yarı çap) isimli bir değişken tanımlayın
        // ilk değeri 21 olsun.
        // Bu dairenin çevresini ve alanını hesaplayan kodu yazın.
        
       double PI;
       PI=3.14159;
       double radius;
       radius=21;
       double cevre=2*PI*radius;
       double alan=PI*(radius*radius);
       System.out.println("Çevre="+cevre);
       System.out.println("Alan="+alan);
       
    }        
}
