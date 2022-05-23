import java.util.LinkedList;

/**
 * 有向图
 * @author vanku
 * @date 2020/5/23
 */
public class DirectedGraph<T> {

    /**
     * 顶点的个数
     */
    private int v;
    /**
     * 邻接表
     */
    private LinkedList<T>[] adj;


    public DirectedGraph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }


    public void add(int s,T t){
        adj[s].add(t);
    }


    public T dfs(){


        return null;
    }

    public T bfs(){


        return null;
    }



}
