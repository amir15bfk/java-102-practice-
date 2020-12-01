
package surfacecalculator;


public class para extends squere{
    double b;
    public para(double x,double y) {
        super(x);
        this.b=y;
    }
    @Override
    public double computeS(){
        return this.a*this.b;
    }
    
}
