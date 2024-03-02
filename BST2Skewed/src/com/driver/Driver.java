package com.driver;

import com.Node;
import com.bst2Skewed.Skewed;

public class Driver {
    public static void main(String[] args) {

        // HardCoding the BST
        Node n1 = new Node(50);
        Node n2 = new Node(20);
        Node n3 = new Node(60);
        Node n4 = new Node(10);
        Node n5 = new Node(30);
        Node n6 = new Node(55);

//        n1.left = n2;
//        n1.right = n3;
//
//        n2.left = n4;
//        n2.right = n5;
//
//        n3.left = n6;
//        n3.right = new Node(70);

        n1.left = n5;
        n1.right = n3;

        n5.left = n4;

        n4.right = n2;

        n3.left = n6;

        Node head = n1;

        // Creating object of skewed class and method to convert BST to Skewed tree
        Skewed s1 = new Skewed();
        s1.bst2skewed(head);

        // Printing the Skewed tree
        s1.print();

    }



}