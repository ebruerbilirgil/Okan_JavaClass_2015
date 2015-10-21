/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebruerbilirgil.lessons.lesson04;

import java.util.Objects;

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
                this("anonim");//this bir cont. dan diğer cont. ı çağırmak için kullandık. ilk satırda olmalı.
//                myname="anonim";
            }
    public void displayMessage()
    
   {
   System.out.println(myname+" Hello");
   }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.myname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GradeBook other = (GradeBook) obj;
        if (!Objects.equals(this.myname, other.myname)) {
            return false;
        }
        return true;
    }

    
   public static void main (String[] args)
   {
   GradeBook my,yours;
   
   my=new GradeBook();//my=new GradeBook("Benim");
//   my.myname="Benim";
   my.displayMessage();
   
   
//   yours=new GradeBook("Sizin");
   yours=new GradeBook();
//   yours.myname="Sizin";
   yours.displayMessage();
   if(my.equals(yours))
   {
   System.out.println("Bunlar aynı.");
   }
   else
   {
   System.out.println("Aynı değil.");
   }
   
   }

}