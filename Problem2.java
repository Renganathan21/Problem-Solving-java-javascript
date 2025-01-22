import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4};
        int target = 3;
        ArrayList<String> res = new ArrayList<>();

        // Iterate through the array to find pairs
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];
             if(!res.isEmpty()){
                  break;  
                }
            for (int j = 0; j < arr.length; j++) {
                if (i != j && find == arr[j]) {
                    res.add("(" + arr[i] + ", " + arr[j] + ")");
                    break;
                }
               
            }
        }

        // Print the results
        if (res.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            for (String pair : res) {
                System.out.println(pair);
            }
        }
    }
}
