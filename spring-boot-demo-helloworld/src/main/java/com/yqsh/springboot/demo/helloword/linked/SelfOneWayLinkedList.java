package com.yqsh.springboot.demo.helloword.linked;

import cn.hutool.core.lang.copier.Copier;

import java.util.LinkedList;

/**
 * 单向链表
 */
public class SelfOneWayLinkedList {

    Node first;

    public void insertFirst(Object val) {
        Node newNode = new Node(val);
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public Node find(Object val) {
        Node current = first;
        Node previous = first;
        while (!current.getVal().equals(val)) {
            if(current.next == null) {
                return null;
            } else {
                previous = first;
                current = current.next;
            }
        }
        if(current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    class Node {

        Node(Object val){
            this.val = val;
        }

        Object val;
        Node next;

        public Object getVal() {
            return val;
        }

        public void setVal(Object val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst("");
        linkedList.removeFirst();
        linkedList.addLast("");
        linkedList.removeLast();

        linkedList.getFirst();

        linkedList.getLast();

        linkedList.iterator();
    }

}
