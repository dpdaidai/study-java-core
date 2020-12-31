package com.core.java.print;

/**
 * @Author chenpantao
 * @Date 2020-05-24 12:04
 * @Version 1.0
 */
class Solution {

    public static void main(String[] arg) {
        int sum = 0;

//        int[] cost1 = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//
//        sum = minCostClimbingStairs(cost1);
//        System.out.println(sum);
        int[] cost2 = new int[]{2, 2, 0, 1};
        sum = minCostClimbingStairs(cost2);
        System.out.println(sum);
    }


    public static int minCostClimbingStairs(int[] cost) {

        int sum = 0;

        int[] newArray = new int[cost.length + 4];
        int start = newArray.length;

        System.arraycopy(cost, 0, newArray, 4, cost.length);

        while (start > 3) {
            // System.out.println(start);
            // System.out.println(sum);
            int step = nestStep1(start, newArray);
            start -= step;
            sum += newArray[start];
        }


        return sum;

    }

    public static int nestStep1(int start, int[] cost) {
        int oneStep = 0;
        int oneStep_1 = cost[start - 1] + cost[start - 3];
        int twoStep_1 = cost[start - 2];

        if (oneStep_1 < twoStep_1) {
            return 1;
        }else{
            return 2;
        }

    }

    public static int nestStep(int start, int[] cost) {
        int oneStep = 0;
        int oneStep_1 = cost[start - 1] + cost[start - 2];
        int oneStep_2 = cost[start - 1] + cost[start - 3];

        if (oneStep_1 < oneStep_2) {
            oneStep = oneStep_1;
        } else {
            oneStep = oneStep_2;
        }

        int twoStep = 0;
        int twoStep_1 = cost[start - 2] + cost[start - 3];
        int twoStep_2 = cost[start - 2] + cost[start - 4];

        if (twoStep_1 < twoStep_2) {
            twoStep = twoStep_1;
        } else {
            twoStep = twoStep_2;
        }

        if (oneStep < twoStep) {
            return 1;
        } else {
            return 2;
        }
    }
}

