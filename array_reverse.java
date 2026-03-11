/*Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, 
the second element becomes second last and so on.
Examples:
Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on. */
public class array_reverse {
    public static void main(String[] args) {
        {
            //int arr[]={1,2,3};  passed
            //int arr[]={1,4,3,2,6,5}; passed
            int arr[] = {4, 5, 1, 2};
            int arr2[]=new int[arr.length];
            int count=1;
            for(int i=arr.length-1;i>=0;i--)
            {
                arr2[Math.abs(i-(arr.length-1))]=arr[i];
            }

            for(int i=0;i<arr2.length;i++)
            {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}
