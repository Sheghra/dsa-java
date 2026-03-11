/*Given an array of integers arr[], 
move all the zeros to the end of the array while maintaining 
the relative order of all non-zero elements.

Examples: 

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s. */

class move_zeroes_to_end{
    public static void main(String[] args)
    {
        //int arr[] ={1, 2, 0, 4, 3, 0, 5, 0};  passed
        //int arr[] ={10,20,30};    passed
        int arr[] = {0,0};  //passed
        int b[]= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            {
                add(b,arr[i]);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(b[i]+" ");
        }
        
    }

    public static void add(int []a,int c)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                a[i]=c;
                return;
            }
        }
    }
}