package Searching_and_Logics;

import java.util.Arrays;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6, 6, 5, 4};
        int[] nums2 = {1, 8, 6, 3, 4, 1, 8, 5, 2,6,4};

        IntersectionOf2Arrays obj = new IntersectionOf2Arrays();
        int[] result = obj.intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        return Arrays.copyOf(temp, k);
    }
}

//unique common elements only.