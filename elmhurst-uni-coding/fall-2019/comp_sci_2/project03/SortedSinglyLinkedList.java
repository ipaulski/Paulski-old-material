
//Izabella Paulski
public class SortedSinglyLinkedList<T extends Number & Comparable<? super T>> {

    private SLL_Node<Integer> head;
    private int size;
    
    public SortedSinglyLinkedList() {
        // DO THIS
        //  Initialize the head to be null and size to be 0
        head = null;
        size = 0;
    }

    public int getSize() {
        // DO THIS
        return size;
    }

    public void clearList() {
        // DO THIS
        head = null;
        size = 0;
    }

    //Add an SLL_Node to the list in the correct place
    //-- ascending order of value and return true
    public boolean add(Integer x) {
        // DO THIS
        SLL_Node<Integer> node = new SLL_Node(x, null);
        if (head == null) {
            head = node;
        } else {
            if (head.getData() > node.getData()) {
                node.setNext(head);
                head = node;
            } else if (head.getData() == node.getData()) {
                return false;
            }else {
                SLL_Node current = head;
                SLL_Node next = current.getNext();
                while (next != null && (Integer) next.getData() < node.getData()) {
                    current = next;
                    next = next.getNext();
                }
                node.setNext(next);
                current.setNext(node);
            }
        }
        size++;
        return true;
    }

    //Remove an SLL_Node from the list; if the value doesn't exist in the list returns false;
    public boolean remove(int x) {
        // DO THIS
        if(size < 1) {
            System.out.println("The value " + x + " is not in the list.");
        }
        else if (size == 1){
            if (head.getData() == x){
                head = null;
                size--;
                return true;
            }
        }
        else{
            SLL_Node<Integer> prev = head;
            SLL_Node<Integer> current = prev.getNext();
            while(prev.getData() != x && prev.getNext() != null){
                if(current.getData() == x){
                    prev.setNext(current.getNext());
                    System.out.println("The value " + x + " is removed.");
                    size--;
                    return true;
                }
                prev = current;
                current = current.getNext();
            }
        }
        return false;
    }

    // Print out all nodes in the list
    public void print() {
        // DO THIS
        SLL_Node<Integer> current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    //find
    public void found(int x){
        boolean isFound = false;
        SLL_Node current = head;
        while (current != null){
            if ((Integer) current.getData() == x){
                isFound = true;
                break;
            }
            current = current.getNext();
        }
        if (isFound) {
            System.out.println(x + " is in the list.");
        } else {
            System.out.println(x + " is not in the list.");
        }
    }
}