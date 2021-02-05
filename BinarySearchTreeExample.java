import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class BinarySearchTreeExample {
    Node root;
    BinarySearchTreeExample(){
        root=null;
    }
    void insert(){
        System.out.println("Enter any data");
        Scanner sc2=new Scanner(System.in);
        int item=sc2.nextInt();
        Node newnode=new Node();
        newnode.data=item;
        newnode.left=null;
        newnode.right=null;
        if(root==null){
            root=newnode;
        }else if(item<root.data){
            
        }else if(item>root.data){
            
        }
        System.out.println("item inserted..");
    }
    void inorder(Node root){
        if(root==null){
            System.out.println("tree empty");
        }else{
            inorder(root.left);
            System.out.print("  "+root.data);
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root==null){
            System.out.println("empty");
        }else{
            System.out.print("  "+root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root==null){
            System.out.println("empty");
        }else{
            postorder(root.left);
            postorder(root.right);
            System.out.print("  "+root.data);
        }
    }
    public static void main(String[] args) {
        BinarySearchTreeExample obj =new BinarySearchTreeExample();
          while(true){
               System.out.println("1.insert");
               System.out.println("2.inorder");
               System.out.println("3.preoder");
               System.out.println("4.postorder");
               
               System.out.println("Enter ur choice");
               Scanner sc=new Scanner(System.in);
               int ch=sc.nextInt();
               switch(ch){
                   case 1:
                       obj.insert();
                       break;
                   case 2:
                       obj.inorder(obj.root);
                       break;
                   case 3:
                       obj.preorder(obj.root);
                       break;
                   case 4:
                        obj.postorder(obj.root);
                       break;
                   case 5:
                       System.exit(0);
                   default:
                       System.out.println("wrong choice");
               }
    }
    }
}