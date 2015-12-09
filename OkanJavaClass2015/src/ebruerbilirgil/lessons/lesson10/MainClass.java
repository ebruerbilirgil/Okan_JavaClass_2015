/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebruerbilirgil.lessons.lesson10;

/**
 *
 * @author User
 */
public class MainClass {
    public static void main(String[] args) {
        TShirt tShirt=new TShirt(TShirtSize.XL);
        System.out.println("Size:"+tShirt.getSize());
    }
}
