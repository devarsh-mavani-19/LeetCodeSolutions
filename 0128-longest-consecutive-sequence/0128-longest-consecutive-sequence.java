class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        int prev = 0;
        for (int n : nums) set.add(n);

        for (int n: nums) {
            if (!set.contains(n-1)) {
                prev=n;
                int tempLong = 1;
                while (set.contains(prev+1)) {
                    tempLong++;
                    prev=prev+1;
                }

                longest = Math.max(tempLong, longest);

            }
        }

        return longest;
        
    }
}