//250542010 Muhammet Yasir Çelik


public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double expNegX = Math.exp(-x);              // e^(-x)
        return multadd(x, expNegX, Math.sqrt(1 - expNegX));
    }

    public static void main(String[] args) {

        // 3. multadd'i basit örnekle test et
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4)); // 2*3+4 = 10

        // 4.a) sin(pi/4) + cos(pi/4)/2
        double result1 = multadd(Math.cos(Math.PI / 4), 0.5,
                                 Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        // 4.b) log 10 + log 20
        // Math.log = doğal log (ln). log10 + log20 = 1*log10 + log20
        double result2 = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("log 10 + log 20 = " + result2);

        // 5. expSum(x) için örnek
        double x = 2.0;
        double result3 = expSum(x);
        System.out.println("expSum(" + x + ") = " + result3);
    }
}
