import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args){
        BinaryTree binarytree = new BinaryTree();
        binarytree.createBinaryTree();
        binarytree.preOrderIterate(binarytree.root);
        binarytree.inOrderRecursive(binarytree.root);
    }
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }
    public void preOrderRecursive(TreeNode root){
        if(root == null){return;}
        System.out.println(root.data + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void preOrderIterate(TreeNode root){
        if(root == null){return;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
       public void inOrderRecursive(TreeNode root){
        if(root == null){ return;}
        inOrderRecursive(root.left);
        System.out.println(root.data);
        inOrderRecursive(root.right);
    }

    public void inOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }

        public void posOrderRecursive(TreeNode root){
        if(root == null){return;}
        posOrderRecursive(root.left);
        posOrderRecursive(root.right);
        System.out.print(root.data + " ");
    }
}

}

