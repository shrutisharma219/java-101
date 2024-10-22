package trees_java;
import java.util.*;
public class preorder_traversal {
    

 public static class TreeNode {
   int val;
TreeNode left;
TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
}
 }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        pre(root,arr);
        return arr;
    }
    public static void pre(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        pre(root.left,arr);
        pre(root.right,arr);
    }
    public static void main(String[] args) {
        TreeNode t=new TreeNode(10);
        t.left=new TreeNode(20);
        t.right=new TreeNode(30);
        t.left.right=new TreeNode(40);
        t.right.left=new TreeNode(50);
        t.right.right=new TreeNode(60);
        List<Integer> a=new ArrayList<>();
        a=preorderTraversal(t);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }





    }
}
    

