/*
Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. 
This array represents a permutation of the integers from 1 to n with one element missing. 
Find the missing element in the array.

Examples: 

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: Here the size of the array is 4, so the range will be [1, 5]. 
The missing number between 1 to 5 is 4 */
public class find_missing_number {
    public static void main(String[] args)
    {
        //int arr[]={8, 2, 4, 5, 3, 7, 1};   passed
        int arr[]={1, 2, 3, 5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i]){
                max=arr[i];
            }
        }

        for(int i=1;i<=max;i++)
        {
            Boolean flag = true;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                    flag = false;
            }
            if(flag == true)
            {
                System.out.print(i);
                break;
            }
        }
    }
}
