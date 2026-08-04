class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                lst.add(matrix[i][j]);
            }
        }
        int[] res = new int[lst.size()];
        int index = 0;
        for (int x : lst) {
            res[index++] = x;
        }
        Arrays.sort(res);
        return res[k - 1];
    }
}