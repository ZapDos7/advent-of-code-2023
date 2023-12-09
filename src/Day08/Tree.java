package Day08;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Tree {
    Map<String, AbstractMap.SimpleEntry<String, String>> tree;


    public Tree() {
        this.tree = new HashMap<>();
    }

    public void addElement(String label, String left, String right) {
        tree.put(label, new AbstractMap.SimpleEntry<>(left, right));
    }

    @Override
    public String toString() {
        return "Tree=" + tree + '\n';
    }
}
