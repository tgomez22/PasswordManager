package com.company;


public class Main {

    public static void main(String[] args) {
    	Tree myTree = new Tree();
	    Node Test1 = new Node();
	    Node Test2 = new Node();
	    Node Test3 = new Node();
	    Test1.addData();
	    Test2.addData();
	    Test3.addData();

	    myTree.addNode(Test1);
	    myTree.addNode(Test2);
	    myTree.addNode(Test3);

	    myTree.displayInOrder();
    }
}
