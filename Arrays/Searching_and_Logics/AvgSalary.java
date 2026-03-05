package Searching_and_Logics;

public class AvgSalary {
    public static void main(String[] arg){
        int[] salary = {10000,20000,30000,35000,15000};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            sum += s;
        }
        System.out.println((sum - min - max)/ salary.length -2);
    }
}
