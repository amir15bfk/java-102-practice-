
package surfacecalculator;


public class circle extends squere {
    
    public circle(double x) {
        super(x);
    }
    @Override
    public double computeS(){
        return this.a*this.a*Math.PI;
    }
    
}
