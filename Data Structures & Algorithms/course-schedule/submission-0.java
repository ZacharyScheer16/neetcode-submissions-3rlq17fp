class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pr : prerequisites) {
            graph.get(pr[1]).add(pr[0]);
        }

        int[] state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (hasCycle(graph, state, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> graph, int[] state, int course) {
        state[course] = 1;

        for (int neighbor : graph.get(course)) {
            if (state[neighbor] == 1) {
                return true;
            }
            if (state[neighbor] == 0) {
                if (hasCycle(graph, state, neighbor)) {
                    return true;
                }
            }
        }

        state[course] = 2;
        return false;
    }
}