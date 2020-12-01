
package surfacecalculator;


public class tringele extends para {
    

    public tringele(double x, double y) {
        super(x, y);
    }
    @Override
    public double computeS(){
        
        return (this.a*this.b)/2;
    }
    @Override
    public void draw(){
        double k=0;
        double x = ((int) (this.b*2)/this.a);
        for (int i=0 ;i<this.a;i++){
            k+=x;
            for (int j=0 ;j<k;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
