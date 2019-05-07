package ua.Course2.week4.hashMap.test;

public class CodingBad {

    public static String[] fizzArray2(int n) {

        String[] mas = new String[n];

        for(int i=0;i<mas.length;i++){

            mas[i] = String.valueOf(i);
        }

        return mas;


    }

    public static void main(String[] args) {

        int n = 5;
        int[] nums1 = {3,2,3};
        int[] nums2 = {2,2,22};

        System.out.println(Math.abs(nums1[0] - nums2[0]) <= 2 && nums1[0] != nums2[0]);

        System.out.println(9%2);

        boolean q = n > 0;

        System.out.println(!q);

        String[] result = fizzArray2(n);

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }

    }
}
