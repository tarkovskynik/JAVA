package ua.course1.week1;

public class HomeWork11 {
    public static void main(String[] args) {
        // Scanner num = new Scanner(System.in);
        int a, b, c, d;

        a = 313;
        b = a % 10;
        System.out.println(" b =  " + b);
        c = ((a % 100) - b) / 10;
        System.out.println(" c =  " + c);
        d = ((a % 1000) - (a % 100)) / 100;
        System.out.println(" d =  " + d);

        if (b == c && c == d)
        {
            System.out.print("True all numbers");
        } else if (b == c)
        {
            System.out.print("true numbers b = c");

        } else if (c == d)
        {
            System.out.print("true numbers c = d");
        } else if (b == d)
        {
            System.out.print("true numbers b = d");
        } else {
            System.out.print("Fail");
        }
    }

}
