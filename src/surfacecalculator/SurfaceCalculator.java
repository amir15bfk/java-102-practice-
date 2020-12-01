
package surfacecalculator;

public class SurfaceCalculator {

    public static void main(String[] args) {
        // TODO code application logic here
        squere s= new squere(5);
        circle c =new circle(5);
        para p =new para(5,10);
        tringele t =new tringele(10,15);
        
        calc.surface(s);
        calc.draw(s);
        calc.surface(c);
        calc.draw(c);
        calc.surface(p);
        calc.draw(p);
        calc.surface(t);
        calc.draw(t);
        
    }
    
}
