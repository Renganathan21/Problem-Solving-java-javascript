class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        int n = freqList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (freqList.get(j).getValue() < freqList.get(j + 1).getValue()) {
                    Collections.swap(freqList, j, j + 1);
                }
            }
        }


        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freqList.get(i).getKey();
        }

        return result;
    }
}
