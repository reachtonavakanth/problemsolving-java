package frequentquestions;

public class ArraySorting {
    public static void main(String[] args) {
        Integer[] arr = {5, 20, 4, 9, 1, 26, 16, 67, 55};
        Integer[] arr1= {5, 20, 4, 9, 1, 26, 16, 67, 55};
        sorArray(arr);
    }

    public static void sorArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+", ");
        }
    }
}
