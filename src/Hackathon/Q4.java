public class Q4 {

    static void printMinOp(int arr[])
    {
        int arraySum, smallest, arr_size = arr.length;
        arraySum = 0;
        smallest = arr[0];
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            arraySum += arr[i];
        }

        int minOperation = arraySum - arr_size * smallest;
        System.out.println(minOperation);
    }
    public static void main(String[] args)
    {
        int arr[] = { 5, 6, 2, 4, 3 };
        printMinOp(arr);
    }
}