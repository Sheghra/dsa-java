/*
Given an array arr[] of size n filled with numbers from 1 to n-1 in random order. 
The array has only one repetitive element. The task is to find the repetitive element.
Examples:
Input: arr[] = [1, 3, 2, 3, 4]
Output: 3
Explanation: The number 3 is the only repeating element.

Input: arr[] = [1, 5, 1, 2, 3, 4]
Output: 1
Explanation: The number 1 is the only repeating element. */
public class repeating_from_1{
    public static void main(String[] args) {
        //int arr[]={1, 3, 2, 3, 4}; passed
        int arr[]={1, 5, 1, 2, 3, 4};
        Boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j]==temp) {
                    flag=true;
                    System.out.println(temp);
                    break;
                }
            }
            if(flag)
                break;
        }
    }
}
