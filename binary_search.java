/*
Consider an array arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 
and the target = 23. 
*/
public class binary_search {
    public static void main(String[] args) {
        //int arr[]={2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; passed
        int arr[] = { 2, 3, 4, 10, 40 };  
        int l=0,h=arr.length-1,mid=arr.length/2,target=10;
        while(true){
            if(arr[mid]==target)
            {
                break;
            }
            else if(arr[mid]<target) //right
            {
                l=mid;
                mid=(int)((l+h)/2);
            }
            else{   //left
                h=mid;
                mid=(int)((l+h)/2);
            }
        }
        System.out.println(target+" was found at "+ mid);
    }
}
