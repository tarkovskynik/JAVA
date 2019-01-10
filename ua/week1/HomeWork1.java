package ua.week1;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int time;
        System.out.print("Time is:  ");
        time = num.nextInt();

        if(time >= 9 && time <= 18)
        {
            System.out.print("At work");
        } else if (time > 18 && time < 24)
        {
            System.out.print("Relax");
        } else if (time >= 0 && time <= 9)
        {
            System.out.print("Relax");
        }


    }
}