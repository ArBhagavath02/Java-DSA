class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    
    BinaryTree(){
        root = null;
    }

    Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if (data < node.data){
            node.left = insert(node.left,data);
        }
        else if(data > node.data){
            node.right= insert(node.right, data);
        }
        return node;
    }
    void inorderTraversel(Node node){
        if(node != null){
            inorderTraversel(node.left);
            System.out.println(node.data + " ");
            inorderTraversel(node.right);
        }
    }
    void preorderTreaversel(Node node){
        if(node != null){
            System.out.println(node.data+" ");
            preorderTreaversel(node.left);
            preorderTreaversel(node.right);
        }
    }
    void postorderTreversel(Node node){
        if(node != null){
            postorderTreversel(node.left);
            postorderTreversel(node.right);
            System.out.println(node.data +" ");
        }
    }
    Node search(Node root, int key){
        if(root == null || root.data == key)
        return root;

        if(root.data < key)
          return search(root.right,key);

        return search(root.left,key);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root,30);
        tree.insert(tree.root,20);
        tree.insert(tree.root,45);
        tree.insert(tree.root,55);
        tree.insert(tree.root,60);
        tree.insert(tree.root,75);

        System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversel(tree.root);

        System.out.println("\n Preorder travrsal of the tree:");
        tree.preorderTreaversel(tree.root);

        System.out.println("\n Postorder traversal of the tree:");
        tree.postorderTreversel(tree.root);

        System.out.println("\nSearch for node value:");
        Node result = tree.search(tree.root,key:40);
        if(result != null)
           System.out.println("Node found:"+result.data);
        else
           System.out.println("Node not found");

    }
}
