package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Homework6_1 {


    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {

        if(root == null) {
            return 0;
        }

        int height = 1;

        for(Node node : root.children) {

            height = Math.max(height, 1 + maxDepth(node));
        }

        return height;

    }
}


