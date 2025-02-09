// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void insertionSort(int[] arr) {
         int n = arr.length;
         for(int i =1 ; i< n; i++){
             int key = arr[i];
             int j = i-1;
             
             while(j>=0 && arr[j] > key){
                  arr[j+1] = arr[j];
                  j--;
                 
             }
             arr[j+1] = key;
         }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}