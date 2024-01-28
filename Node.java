public class Node<E> {
    E element;
    Node<E> next; //Self referential recursive architecture
    
    public Node(E e) { //Constructor of a new node to the list
        element = e;
    }
    
    public String toString() {
        return "" + element;
    }
}