package implementation;

import java.util.Queue;

public interface BreadthFirstSearch extends Search {
     public void add(Queue<Queen> queue,Queen queen);
     public void remove(Queue<Queen> queue,Queen queen);
}
