class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
        }

        if (sum < 0) {
            return -1;
        }

        int start_index = 0;
        int remaining = 0;

        for (int i = 0; i < gas.length; i++) {
            int curr_gas = gas[i] + remaining;
            int curr_cost = cost[i];
            remaining = curr_gas - curr_cost;

            if (remaining < 0) {
                start_index = i + 1;
                remaining = 0;
            }
        }

        return start_index;
    }
}