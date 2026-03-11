/*Given an array arr[], sort the array according to the following relations:  

arr[i] >= arr[i - 1], if i is even, ∀ 1 <= i < n
arr[i] <= arr[i - 1], if i is odd, ∀ 1 <= i < n
Find the resultant array.[consider 1-based indexing]

Examples:  

Input: arr[] = [1, 2, 2, 1]
Output: [1 2 1 2]
 Explanation:
For i = 2, arr[i] >= arr[i-1]. So, 2 >= 1.
For i = 3, arr[i] <= arr[i-1]. So, 1 <= 2.
For i = 4, arr[i] >= arr[i-1]. So, 2 >= 1.

Input: arr[] = [1, 3, 2]
Output: [1 3 2]
Explanation: 
For i = 2, arr[i] >= arr[i-1]. So, 3 >= 1.
For i = 3, arr[i] <= arr[i-1]. So, 2 <= 3. */
public class rearrange_1 {
    public static void main(String[] args){
        //int arr[]={1, 2, 2, 1};
        int arr[]={1,3,2};
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                if (!(arr[i]>=arr[i-1])) {
                    arr[i]+=arr[i-1];
                    arr[i-1]=arr[i]-arr[i-1];
                    arr[i]-=arr[i-1];
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}    

