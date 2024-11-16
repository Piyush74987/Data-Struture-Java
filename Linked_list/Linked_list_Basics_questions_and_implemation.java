package Linked_list;

public class Linked_list_Basics_questions_and_implemation {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode =new Node(data);//  created new node data
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next= head;
        head=newNode;

    }
    public void addlast(int data){
        Node newNode =new Node(data); //  created new node data
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int data,int index){
        if(head==null){
            addfirst(data);
            return;
        }
        Node newNode =new Node(data); //  created new node data
        size++;
        Node temp =head;
        int i =0;
        while(i!=index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print(){

        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void removefirst(){
        if(head==null){
            System.out.println("null");
            size--;
        }
        else if (size==1){
            head=tail=null;
            size=0;
        }
        else{
            head=head.next;
            size--;
        }
    }
    public void removelast(){
        if(head==null){
            System.out.println("null");
            size--;
        }
        else if (size==1){
            head=tail=null;
            size=0;
        }
        else{
            Node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
    }
    public  static int itr_search(int key){
        if(head==null){
            return -1;
        }
        Node temp =head;
        int i=0;
        while(temp.next!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }
    public int helper(Node head, int key){
        if(head ==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int inx=helper(head.next,key);
        if(inx==-1){
            return-1;
        }
        return inx+1;
    }
    public int recursive(int key){

        return helper(head,key);
    }
    public void reverse(){
        Node prev =null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        Linked_list_Basics_questions_and_implemation ll = new Linked_list_Basics_questions_and_implemation();
        ll.print();//        null
        ll.addfirst(2);
        ll.print();//2-->null
        ll.addfirst(1);
        ll.print();//        1-->2-->null
        ll.addlast(4);
        ll.print();//        1-->2-->4-->null
        ll.addlast(5);
        ll.print();//        1-->2-->4-->5-->null
        ll.add(3,2);
//        ll.print();//        1-->2-->3-->4-->5-->null
//        System.out.println(size); //        5
//        ll.removefirst();;//        2-->3-->4-->5-->null
//        ll.print();
//        ll.removelast();//        2-->3-->4-->null
//        ll.print();
//        System.out.println(size);// 3
//        System.out.println(itr_search(4));// 3
//        System.out.println(itr_search(10));//-1
        System.out.println(ll.recursive(2)); // 1
        System.out.println(ll.recursive(10));// -1
        ll.reverse();
        ll.print();// 5-->4-->3-->2-->1-->null
    }
}
//output
//        null
//        2-->null
//        1-->2-->null
//        1-->2-->4-->null
//        1-->2-->4-->5-->null
//        1-->2-->3-->4-->5-->null
//        5
//        2-->3-->4-->5-->null
//        2-->3-->4-->null
//        3
