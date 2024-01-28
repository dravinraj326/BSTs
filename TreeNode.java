public class TreeNode<E extends Comparable<E>> { 
    protected E element;
    protected TreeNode<E> left; //Self referential recursive architecture
    protected TreeNode<E> right; //Self referential recursive architecture
    protected Node<Article> head; //added
    //No need for a tail node data field
    
    public TreeNode(E e) { //Constructor of a new node to the tree
        element = e;
    }
    
    public void addFirst(Article a) { //Variation of addFirst from normal linkedList to be of type Article
        Node<Article> newNode = new Node<Article>(a);
        newNode.next = head; 
        head = newNode; //Move the head
        
    }
    
}