public class ConversorTemperatura {

    public double conversor(double a){
        a = (a * 9 / 5) + 32;
        return a;   
    }

    public double conversor(double a, double b){
        a = (b - 32) * 5 / 9;
        return a;
    }

    public double conversor(double a, double b, double c){
        a = ((b * 9) / 5) + 32;
        c = c + b;
        return c;   
    }
}

