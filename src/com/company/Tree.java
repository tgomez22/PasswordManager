package com.company;

public class Tree {
    private Node root;

    public Tree(){
        root = null;
    }

    public void addNode(Node toAdd){
        if(root == null){
            root = new Node(toAdd);
        }

        else{
            addNode(root, toAdd);
        }
    }

    private Node addNode(Node current, Node toAdd){
        if(current == null){
            current = new Node(toAdd);
            return current;
        }

        else if(current.compare(toAdd) <= 0){
            current.setRight(addNode(current.toRight(), toAdd));
        }

        else{
            current.setLeft(addNode(current.toLeft(), toAdd));
        }

        return current;
    }

    public void displayInOrder(){
        if(root == null){
            return;
        }

        else{
            displayInOrder(root);
        }
    }

    private void displayInOrder(Node current){
        if(current == null){
            return;
        }

        displayInOrder(current.toLeft());
        current.display();
        displayInOrder(current.toRight());

        return;
    }
}
