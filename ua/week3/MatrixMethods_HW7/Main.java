package ua.week3.MatrixMethods_HW7;

public class Main {
    public static void main(String[] args) {
        // find the longest continuous chain of zeros (0) and ones(1)

        String numbers = "10001101001";

        char[] string = numbers.toCharArray();

        int zero = 0;
        int maxZeroCount = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < string.length; i++) {
            if (string[i] == '0') {
                zero++;
            } else {
                if (zero > maxZeroCount) {
                    maxZeroCount = zero;
                    end = i;
                    start = end - zero + 1;
                }
                zero = 0;
            }
        }
        System.out.print("Max Zero Count = " + maxZeroCount + " start = " + start + " end = " + end);
        System.out.println();

        int once = 0;
        int maxOnceCount = 0;
        int start1 = 0;
        int end1 = 0;

        for (int i = 0; i < string.length; i++) {
            if(string[i] == '1'){
                once ++;
            }else{
                if(once > maxOnceCount){
                    maxOnceCount = once;
                    end1 = i;
                    start1 = end1 - once + 1;
                }
                once = 0;
            }
        }
        System.out.print("Max Once Count = " + maxOnceCount + " start = " + start1 + " end = " + end1 );

    }
}
