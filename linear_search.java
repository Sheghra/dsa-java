public class linear_search{
    public static void main(String[] args){
        int arr[]={1,2,34,54,3,6,24,65};
        int index = binsearch(arr,52);

        if(!(index==-1))
        {
            System.out.println("The value is at index : "+index);
        }
        else
            System.out.println("Element not present in the list");
    }

    public static int binsearch(int[] a,int value){
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==value){
                return i;
            }
        }
        return -1;
    }
}