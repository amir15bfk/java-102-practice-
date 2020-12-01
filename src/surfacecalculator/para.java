
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
    @Override
    public void draw(){
        for (int i=0 ;i<this.a;i++){
            for (int j=0 ;j<this.a-i;j++){
                System.out.print(" ");
            }
            for (int j=0 ;j<this.b*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
