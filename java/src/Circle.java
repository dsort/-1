public class Circle extends Figure {

    public Circle(double R){
        S = R*R*Math.PI;
        P = R*2*Math.PI;
    }
    public Circle (double a, double b, double c, double d){
        double R = Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        S = R*R*Math.PI;
        P = R*2*Math.PI;
    }
    double circleS(){return S;}
    double circleP(){return P;}



}
