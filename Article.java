class Article { //Like a node, but has 3 elements instead of 1 element and a next field
    int id; //Instance variable
    String title; //Instance variable
    String author; //Instance variable
    
    public Article(int i, String t, String a) { //Parameterized constructor
        id = i; 
        title = t;
        author = a;
    }
    
    public String toString() {
        return String.format("\t %d | %s | %s-->\n", id, title, author);
    }
}