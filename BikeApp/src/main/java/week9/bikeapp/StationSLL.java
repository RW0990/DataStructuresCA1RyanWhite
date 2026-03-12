/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class StationSLL implements SingleLinkedListInterface {
    private Node head;
    private int size;
    private Node curr;
    private Node prev;
    
    public StationSLL(){
        head=null;
        size=0;
        curr=null;
        prev=null;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
    }else{
            return false;
        }
    }
    public int size(){
        return size;
    }
    public void add(int index,Object item){
        if(index==1){
            Node newNode=new Node(item,head);
            head=newNode;
        }else{
            setCurrent(index);
            Node newNode=new Node(item,curr);
            prev.setNext(newNode);
        }
        size++;
    }
    public void add(Object element){
        Node newNode=new Node(element,null);
        if(head==null){
            head=newNode;
        }else{
            setCurrent(size);
            curr.setNext(newNode);
        }
        size=size+1;
    }
    public Object get(int index){
        setCurrent(index);
        return curr.getElement();
    }
    public void remove(int index){
        if(index==1){
            head=head.getNext();
        }else{
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size--;
    }
    private void setCurrent(int index){
        int s;
        prev = null;
        curr=head;
        for(s=1; s<index; s++){
            prev=curr;
            curr=curr.getNext();
        }
    }
    public void printList(){
        Node sNode=head;
        while(sNode!=null){
            System.out.println(sNode.toString());
            sNode=sNode.getNext();
        }
    }

    
}

