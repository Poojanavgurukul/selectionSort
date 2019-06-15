public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        selectionSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static void selectionSort(int []numberList){
        for (int i = 0; i <numberList.length-1 ; i++) {
            int mid=i;
            for (int j = i+1; j <numberList.length ; j++) {
                if (numberList[j]<numberList[mid]){
                    mid=j;
                }
            }
            int swap=numberList[mid];
            numberList[mid]=numberList[i];
            numberList[i]=swap;
        }
    }
}
