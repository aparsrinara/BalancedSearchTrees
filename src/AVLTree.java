public class AVLTree {

    private int myItem;
    private AVLTree myLeft;
    private AVLTree myRight;
    private int myBalanceFactor;    // Use this only if you feel you find it convenient

    // Constructor for an AVLTree with one item
    // Don't worry about the empty AVLTree case
    public AVLTree(int item) {
        myItem = item;
        myLeft = null;
        myRight = null;
        myBalanceFactor = 0;
    }

    // Maintains the binary search tree invariants
    // Also maintains the height-balanced invariant
    public void insert(int item) {
        
    }

    public String toString() {
        return toStringHelper(this, "");
    }

    private String toStringHelper(AVLTree subTree, String soFar) {
        String toReturn = "";
        if (subTree.myRight != null) {
            toReturn += toStringHelper(subTree.myRight, "    " + soFar);
        }
        toReturn += "\n" + soFar + subTree.myItem + "\n";
        if (subTree.myLeft != null) {
            toReturn += toStringHelper(subTree.myLeft, "    " + soFar);   
        }
        return toReturn;
    }

}