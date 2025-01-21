import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5};
         ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0 ; i< arr.length ; i++){
            for(int j = i +1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    res.add(arr[i]);
                }
            }
        }
        for (int i = 0 ; i < res.size() ; i++){
            System.out.println(res.get(i));
        }
    }
}