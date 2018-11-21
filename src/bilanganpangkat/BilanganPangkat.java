/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanganpangkat;

/**
 *
 * @author tikamhrdk
 */
public class BilanganPangkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y=-9;
        int x=2;
        int z;
        double a;
        if(y>0 && x>0){
            for (int i = 1; i <y;i++){
                x *= x;
            }System.out.println(x);
        }else if (y>0 && x<0){
            if((y%2)==0){
                z=-(x);
                for (int i = 1; i <y;i++){
                    x *= x;
                }System.out.println(x);
              
            }else if((y%2)==1){
                z=-(x);
                for (int i = 1; i <y;i++){
                    x *= x;
                }System.out.println(-(x));
 
            }
        }else if(y<0 && x>0){
            for (int i = 1; i <y;i++){
                x *= x;
            }a=1/(x);
            System.out.println(a);
 
        }
    }
}    
        
    

    

