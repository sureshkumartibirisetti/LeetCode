class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i : answers) mpp.put(i, mpp.getOrDefault(i, 0) + 1);

        int total = 0;
        for (Map.Entry<Integer, Integer> p : mpp.entrySet())
            total += Math.ceil((double)p.getValue() / (p.getKey() + 1)) * (p.getKey() + 1);

        return total;
    }
}
