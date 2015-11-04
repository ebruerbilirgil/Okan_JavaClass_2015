/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebruerbilirgil.homeworks.homework02;

/**
 *
 * @author USER
 */
public class Triangle {
    // *
    // **
    // ***
    // ****
    public static void leftAllignedTriangle(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //    *
    //   **
    //  ***
    // ****
    public static void rightAllignedTriangle(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(j < len - i - 1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
    //   *
    //  ***
    // *****
    public static void triangle(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 *i +1; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }        
    }
 public static void reverseLeftAlignedTriangle(int len)
     {
                        //asagidan uste
        int baslangic = 0;
        
        for(int i = len; len>=baslangic; len--) {
            for(int j = baslangic; j<len; j++){
                System.out.print("*");
            }
            System.out.print("\n");

     }
     }
 public static void reverseRighttAlignedTriangle(int len)
     {
       for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = i; j < len; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
 
  public static void reverseTriangle(int len)
     {
         int x = (len * 2) - 1;
    int y = 1 ;

    for(int l = 0; l < len; l++){
      
      for(int s = y; s > 0; s--){
        System.out.print(" ");
      }
      
      for(int s = 0; s < x ; s++){
        System.out.print("*");
      }
      
      System.out.println();
      x-=2;
      y++;
    }
              
     }
  public static void diamond(int len)
     {
         
     }
    public static void main(String[] args) {

        rightAllignedTriangle(5);
        leftAllignedTriangle(10);
        triangle(10);
        reverseLeftAlignedTriangle(5);
        reverseRighttAlignedTriangle(6);
        reverseTriangle(3);
        //diamond();
    }
}
