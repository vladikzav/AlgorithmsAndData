package lesson7;

import java.util.LinkedList;

public abstract class GraphFirstPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    public GraphFirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        gfs(g, source);
    }

    protected abstract void gfs(Graph g, int source);


    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }


}
