/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebruerbilirgil.lessons.lesson04;

/**
 *
 * @author User
 */
public class GradeBook {
    
    String myname;
    public void displayMessage()
    
   {
   System.out.println(myname+" Hello");
   }

   public static void main (String[] args)
   {
   GradeBook my,yours;
   
   my=new GradeBook();
   my.myname="Benim";
   my.displayMessage();
   
   
   yours=new GradeBook();
   yours.myname="Sizin";
   yours.displayMessage();
   
   }

}