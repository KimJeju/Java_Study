public class test3 {
    public static void main(String[] args) {


    }

    public static class Solution {
        public int[][] createMatrix(int[][] edges) {
            // TODO:
            int[][] graph;

            int edgelength = 0;

            for (int i = 0; i < edges.length; ++i) {
                for (int j = 0; j < edges[i].length; ++j) {
                    edgelength = edges[i][j];
                }
            }

            graph = new int[edgelength + 1][edgelength + 1];


            return graph;
        }
    }
}
