public class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int number = nums[i];

            if (map.containsKey(number)) {
                int oldFrequency = map.get(number);
                map.put(number, oldFrequency + 1);
            } 
            else {
                map.put(number, 1);
            }
        }


        // Step 2: Store map data into list
        ArrayList<int[]> list = new ArrayList<>();

        for (Integer key : map.keySet()) {

            int frequency = map.get(key);

            int[] pair = new int[2];
            pair[0] = frequency;
            pair[1] = key;

            list.add(pair);
        }


        // Step 3: Sort according to frequency (highest first)
        Collections.sort(list, (a, b) -> {
            return b[0] - a[0];
        });


        // Step 4: Pick first k elements
        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {

            int[] pair = list.get(i);

            answer[i] = pair[1];
        }

        return answer;
    }
}