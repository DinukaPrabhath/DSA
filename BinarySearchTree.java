class BSTNode {
    int key;
    BSTNode left, right;

    BSTNode(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BinarySearchTree {

    BSTNode root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            return new BSTNode(key);
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(BSTNode root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int v : values) {
            bst.insert(v);
        }

        System.out.print("Inorder Traversal: ");
        bst.inorder();

        System.out.println("\nSearch 40: " + bst.search(40));
        System.out.println("Search 25: " + bst.search(25));
    }
}
