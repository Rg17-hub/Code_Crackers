/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit
 */
public class pattern9 {
      public static void main(String[] args){
          int k;
        for(int i=1;i<=7;i++){
            k=7-i;
            for(int j=1;j<=7;j++){
                if(j<=8-i){
                    System.out.print(k);
                    k--;
                }else{
                    System.out.print(" ");
                }
               
            }
             System.out.println();
        }
    }
}