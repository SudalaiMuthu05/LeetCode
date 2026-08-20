class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for (int pile : piles) {
            pq.add(pile);
            sum += pile;
        }
        while (k > 0) {
            int largest = pq.poll();
            int removed = largest / 2;
            sum -= removed;
            pq.add(largest - removed);
            k--;
        }
        return sum;
    }
}