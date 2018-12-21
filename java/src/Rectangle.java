public class Rectangle extends Figure {
    public Rectangle(double Width, double Height){
        S = Width*Height;
        P = (Width+Height)*2;
    }
    public Rectangle (double a, double b, double c, double d){
        double Height = Math.abs(a-c);
        double Width = Math.abs(b-d);
        S = Width*Height;
        P = (Width+Height)*2;
    }
    double rectangleS(){return S;}
    double rectangleP(){return P;}
}