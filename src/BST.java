import java.util.*;

public class BST {
    BSTNode myRoot;

    public BST(LinkedList list) {
        myRoot = linkedListToTree(list.iterator(), list.size());
    }

    // Your comment here
    private static BST linkedListToTree (Iterator iter, int n) {
        
        return null;
    }

    private class BSTNode {
        Object myItem;
        BSTNode myLeft;
        BSTNode myRight;
    }
}