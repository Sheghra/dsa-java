/*Given an integer array arr[] and an integer k, determine whether there exist two indices i and j 
such that arr[i] == arr[j] and |i - j| ≤ k. 
If such a pair exists, return 'Yes', otherwise return 'No'.

Examples: 

Input: k = 3, arr[] = [1, 2, 3, 4, 1, 2, 3, 4]
Output: No
Explanation: Each element in the given array arr[] appears twice and the distance between every element and its duplicate is 4.

Input: k = 3, arr[] = [1, 2, 3, 1, 4, 5]
Output: Yes
Explanation: 1 is present at index 0 and 3.

Input: k = 3, arr[] = [1, 2, 3, 4, 5]
Output: No
Explanation: There is no duplicate element in arr[].
 */
public class Duplicates_within_K_distance {
    public static void main(String[] args) {
        {
            //int arr[]={1, 2, 3, 4, 1, 2, 3, 4},k=3;
            //int arr[]={1, 2, 3, 1, 4, 5},k=3;
            int arr[]={1, 2, 3, 4, 5},k=3;
            int val=0;Boolean flag=false;

            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j]){
                        val=Math.abs(i-j);    //|0-4| = 4
                        flag=true;
                        break;
                    }
                }
                if(flag==true)
                {
                    if (val<=k){
                        System.out.println("Yes");
                        break;
                    }
                }
                System.out.println("No");
                break;
                
            }
        }
    }
}
