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
//new belleği ayırıyo, constructor dolduruyo.
public class GradeBook {
    
    String myname;
    
    public GradeBook(String name)
    {
                myname=name;
    }
    public GradeBook()//constructor'lar sınıfla aynı isimle olucak.
            {
                this("anonim");
//                myname="anonim";
            }
    public void displayMessage()
    
   {
   System.out.println(myname+" Hello");
   }

   public static void main (String[] args)
   {
   GradeBook my,yours;
   
   my=new GradeBook("Benim");
//   my.myname="Benim";
   my.displayMessage();
   
   
//   yours=new GradeBook("Sizin");
   yours=new GradeBook();
//   yours.myname="Sizin";
   yours.displayMessage();
   
   }

}