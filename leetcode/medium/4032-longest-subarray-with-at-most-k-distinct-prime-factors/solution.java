class Solution {
    public int longestSubarray(int[] arr, int k) {
        int slow = 0;
        int fast = 0;
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (fast < arr.length) {

            Set<Integer> factors = getPrimeFactors(arr[fast]);

            for (int factor : factors) {
                map.put(factor, map.getOrDefault(factor, 0) + 1);
            }

            while (map.size() > k) {
                Set<Integer> removeFactors = getPrimeFactors(arr[slow]);

                for (int factor : removeFactors) {
                    map.put(factor, map.get(factor) - 1);

                    if (map.get(factor) == 0) {
                        map.remove(factor);
                    }
                }

                slow++;
            }

            ans = Math.max(ans, fast - slow + 1);
            fast++;
        }

        return ans;
    }

    public static Set<Integer> getPrimeFactors(int n) {
        Set<Integer> set = new HashSet<>();

        while (n % 2 == 0) {
            set.add(2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            set.add(n);
        }

        return set;
    }
}