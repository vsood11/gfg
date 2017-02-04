package com.gfg.list;

/**
 * Created by varunsudan on 2/3/17.
 */
public class GetNthNode {

    public Node getNode(int n, LinkedList l) {

        if(l.getHead() == null) {
            throw new RuntimeException("Empty List");
        }

        Node temp = l.getHead();

        int count = 1;

        while((temp != null) && (count < n)) {
            temp = temp.getNext();
            count++;
        }

        return temp;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        GetNthNode g = new GetNthNode();

        Node n = new Node(1);
        l.insert(n);
        n = new Node(2);
        l.insert(n);
        n = new Node(3);
        l.insert(n);

        System.out.println(g.getNode(2, l).getData());
    }
}
