package com.codecool.projectrewrite;

public class ProjectRewrite {
    public static void main(String[] args) {
        int[] valuesArray = {2, 6, 120, -5, 69, 64};
        min(valuesArray);
        max(valuesArray);
        length(valuesArray);
        multiply(8, 9);
        pow(10, 5);
    }

    private static int min(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        System.out.println(min);
        return min;
    }

    private static int max(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        System.out.println(max);
        return max;
    }

    private static int length(int[] valuesArr) {
        int length = 0;

             for (int i : valuesArr) {
                 length++;
             }
        System.out.println(length);
        return 0;
    }

    private static int multiply(int x, int y) {
        int result = x*y;
        System.out.println(result);
        return 0;
    }

    private static int pow(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
                result = x*result;
        }
        System.out.println(result);
        return 0;
    }

    private static int[] divmod(int x, int y) { return new int[0]; }
}
