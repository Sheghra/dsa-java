/*Given an array arr[] of size n, the task is to find all the Leaders in the array. 
An element is a Leader if it is greater than or equal to all the elements to its right side.
Note: The rightmost element is always a leader. 

Input: arr[] = [16, 17, 4, 3, 5, 2]
Output: [17 5 2]
Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 
5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, 
therefore 2 is a leader.*/

public class leaders_in_array {
    public static void main(String[] args)
    {
        //int arr[] = {16, 17, 4, 3, 5, 2};
        int arr[] ={1, 2, 3, 4, 5, 2};
        for(int i=0;i<arr.length;i++)
        {
            boolean flag =true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
