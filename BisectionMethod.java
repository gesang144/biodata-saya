public class BisectionMethod{
    static final float EPSILON = (float)0.01;
    

   public static double func(double x)
    {
        return x + 4*x + 2; // Bisection method x + 4*x + 2
    }

    public  static void bisection(double a, double b)
    {
        if (func(a) * func(b) == 0)
        {

            return;
        }

        double c = a;
        while ((b-a) >= EPSILON)
        {

            c = (a+b)/2;


            if (func(c) == 0.0)
                break;


            else if (func(c)*func(a) < 0)
                b = c;
            else
                a = c;
        }

        System.out.printf("Nilai root adalah : %.4f",c);
    }


    public static void main(String[] args)
    {
        double a =-100, b = 300; //nilai untuk menguji fungsi
        bisection(a, b);
    }

}
