package com.bst2Skewed;

import com.Node;
public class Skewed {
    static  Node root = null;

       public void bst2skewed(Node head)
       {

           if (head == null)
               return;
           else {
               bst2skewed(head.left);
               insert(head.key,root);
               bst2skewed(head.right);
           }
       }

        public void insert(int data, Node head)
        {

            if (root == null)
            {
                Node temp = new Node(data);
                root = temp;
            }
            else
            {
                // Traverse the tree
                while (head.right != null)
                {

                    head = head.right;
                }

                Node temp = new Node(data);
                head.right = temp;
            }

        }


    public void print()
        {

            Node temp = root;
            while (temp.right != null)
            {
                System.out.print(temp.key + " ");
                temp = temp.right;

            }
            System.out.print(temp.key);
        }

}
