/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebruerbilirgil.lessons.lesson07;

/**
 *
 * @author User
 */
    
    class MyOuter{
        private int x=7;
        
            class MyInner{
            
                   public void seeOuther(){
                   
                       System.out.println("Outher x is "+x);
                       System.out.println("Inner class ref is "+this);
                       System.out.println("Outher class ref is "+MyOuter.this);
                   }
            }
            
             public void makeInner(){
                    MyInner in=new MyInner();
                    in.seeOuther();  
             }
    public static void main(String[] args) {
        
        MyOuter.MyInner inner= new MyOuter().new MyInner();
        inner.seeOuther();
    }
    
}
