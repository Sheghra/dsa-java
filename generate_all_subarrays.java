/*Given an array arr[], the task is to generate all the possible subarrays of the given array.

Examples: 

Input: arr[] = [1, 2, 3]
Output: [ [1], [1, 2], [2], [1, 2, 3], [2, 3], [3] ]

Input: arr[] = [1, 2]
Output: [ [1], [1, 2], [2] ] */
public class generate_all_subarrays {
    public static void main(String[] args) {
        //int arr[] ={1,2,3}; passed
        int arr[] = {1,2};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
                              