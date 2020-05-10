package com.company;
import java.util.Scanner;

public class Tree {
    private Node root;
    private String profile;

    public Tree(String toUse){
        root = null;
        profile = new String(toUse);
    }

    public int userMenu(){
        int result = 0;
        Scanner in = new Scanner(System.in);

        do{

            System.out.print("Welcome to your password manager, ");
            System.out.print(profile);
            System.out.println();

            System.out.println("Press 1 to see all saved info.");
            System.out.println("Press 2 to search for a password by company name.");
            System.out.println("Press 3 to remove a password.");
            System.out.println("Press 7 to quit the program.");
            System.out.print("Choice: ");
            result = in.nextInt();
            System.out.println();

            if(result == 1)
                displayInOrder();

            else if(result == 2){
                System.out.print("What is the name of the company you want the password for?: ");
                String temp = in.next();
                findInfo(temp);
            }

            else if(result == 3){

            }

        }while(result < 7);

        System.out.print("Goodbye, ");
        System.out.print(profile);
        System.out.print("!");
        System.out.println();
        return 1;
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

    public boolean findInfo(String toFind){
        if(root == null){
            return false;
        }

        else{
            return findInfo(toFind, root);
        }
    }

    private boolean findInfo(String toFind, Node current){
        boolean flag = false;
        if(current == null){
            return false;
        }

        int temp = current.compare(toFind);

        if(temp < 0){
            flag = findInfo(toFind, current.toRight());
        }

        else if(temp > 0){
            flag = findInfo(toFind, current.toLeft());
        }

        else{
            current.display();
        }

        return flag;
    }
}
