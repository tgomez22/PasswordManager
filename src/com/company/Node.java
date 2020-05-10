package com.company;

import java.util.Scanner;
public class Node {
    private String userName; //or email.
    private String password;
    private String companyName;
    private Node left;
    private Node right;

    public Node(){
        left = right = null;
    }

    public Node toLeft(){
        return left;
    }

    public Node toRight(){
        return right;
    }

    public void setLeft(Node toAdd){
        this.left = toAdd;
    }

    public void setRight(Node toAdd){
        this.right = toAdd;
    }

    public Node(Node toCopy){
        userName = new String(toCopy.userName);
        password = new String(toCopy.password);
        companyName = new String(toCopy.companyName);
        left = right = null;
    }

    public void display(){
        System.out.print(companyName);
        System.out.println();

        System.out.print("Username: ");
        System.out.println(userName);
        System.out.print("Password: ");
        System.out.println(password);

    }
    public void addData(){
        System.out.print("What is the name of the organization this password is for? I.E. Amazon, Google, etc.: ");
        Scanner in = new Scanner(System.in);
        companyName = in.nextLine();
        System.out.println();

        System.out.print("Please enter your user name or email used for authentication: ");
        userName = in.nextLine();
        System.out.println();

        System.out.print("Please enter the password you use for this organization: ");
        password = in.nextLine();
        System.out.println();
    }

    public int compare(Node toCompare){
        return companyName.compareToIgnoreCase(toCompare.companyName);
    }
}
