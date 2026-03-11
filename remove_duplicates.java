/*Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the 
beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

Examples: 

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: All the elements are 2, So only keep one instance of 2.

Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
Output: [1, 2, 3, 4, 5]

Input: arr[] = [1, 2, 3]
Output: [1, 2, 3]
Explanation : No change as all elements are distinct. */

class remove_duplicates{
    public static void main(String[] args)
    {
        //int arr[] = {2, 2, 2, 2, 2};
        int arr[] ={1, 2, 2, 3, 4, 4, 4, 5, 5};
        //int arr[] ={1,2,3};
        int arr1[] = new int[arr.length],j=0,i;
        arr1[0]=arr[0];
        for(i=1;i<arr.length;i++)
        {
            Boolean flag = false;
            for(;j<arr1.length;j++)
            {
                if(arr1[j]==0)
                    break;
                else if(arr[i]==arr1[j]){
                    flag = true;
                    break;
                }
            }

            if(flag==false)
            {
                arr1[j]=arr[i];
            }
        }

        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        
    }
}