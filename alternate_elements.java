public class alternate_elements {
    public static void main(String[] args) {
        //int arr[] ={10, 20, 30, 40, 50};
        int arr[] ={-5, 1, 4, 2, 12};

        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
                continue;
            System.out.print(arr[i]+" ");
        }
    }
}
