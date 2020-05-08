public class Node {
    private String userName; //or email.
    private String password;
    private String companyName;
    private Node left;
    private Node right;

    Node toLeft(){
        return left;
    }

    Node toRight(){
        return right;
    }

    void setLeft(Node toAdd){
        this.left = toAdd;
    }

    void setRight(Node toAdd){
        this.right = toAdd;
    }

}
