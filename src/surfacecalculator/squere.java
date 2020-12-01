/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surfacecalculator;


public class squere {
    public double a ;
    public squere(double x){
        this.a =x;
        
    }
    public double computeS(){
        return this.a*this.a;
    }
    public void draw(){
        for (int i=0 ;i<this.a;i++){
            System.out.print("  ");
            for (int j=0 ;j<this.a*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
