public class Triangle extends Figure{
    public Triangle(double a, double b, double c){
        if(a>=b+c || b>=a+c || c>=a+b){
            System.out.println("this triangle cannot exist, please repeat");
            return;
        }
        P = a+b+c;
        double p = P/2.0;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    double triangleS(){return S;}
    double triangleP(){return P;}
}
