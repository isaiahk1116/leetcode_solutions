class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int [2];

        // BRUTE FORCE SOLUTION O(n^2)
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i]+nums[j] == target) {
        //             arr[0] = i;
        //             arr[1] = j;

        //             return arr;
        //         }
        //     }
        // }

        // OPTIMIZED SOLUTION O(n)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                arr[1] = i;
                arr[0] = map.get(target-nums[i]);
                return arr;
            }

            map.put(nums[i], i);
        }

        return arr;
    }
}