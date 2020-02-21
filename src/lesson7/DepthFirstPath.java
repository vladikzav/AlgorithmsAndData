package lesson7;

import java.util.LinkedList;

public class DepthFirstPath extends GraphFirstPath {

    public DepthFirstPath(Graph g, int source) {
        super(g, source);
    }

    @Override
    protected void gfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                gfs(g, w);
            }
        }
    }


}
