
package surfacecalculator;

public class SurfaceCalculator {

    public static void main(String[] args) {
        // TODO code application logic here
        squere s= new squere(5);
        circle c =new circle(5);
        para p =new para(5,3);
        tringele t =new tringele(1,1);
        
        calc.surface(s);
        calc.surface(c);
        calc.surface(p);
        calc.surface(t);
        
    }
    
}
