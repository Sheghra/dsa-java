/*
Given an integer array arr[], compute the sum of all possible sub-arrays of the array.
A sub-array is a contiguous part of the array.

Examples: 

Input: arr[] = [1, 4, 5, 3, 2]
Output: 116
Explanation: Sum of all possible subarrays of the array [1, 4, 5, 3, 2] is 116.

Input: arr[] = [1, 2, 3, 4]
Output: 50
Explanation: Sum of all possible subarrays of the array [1, 2, 3, 4] is 50. */
import java.util.Arrays;
public class sum_of_subarrays {
    public static void main(String[] args)
    {
        //int arr[] ={1,4,5,3,2};
        int arr[]={1,2,3,4};
        int temp[]=new int[arr.length];
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            Arrays.fill(temp,0);
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    temp[k]=arr[k];
                }
                sum+=sumarr(temp);
            }
        }

        System.out.println(sum);
    }

    public static int sumarr(int[] a)
    {
        int s=0;
        for(int b : a)
        {
            s+=b;
        }
        return s;
    }
}
