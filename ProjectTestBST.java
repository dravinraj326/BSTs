import java.io.*;

class ProjectTestBST {
    BufferedReader fileReader; //Instance variable
    BST<String> bst; //Instance variable
    
    public static void main(String[] args) {
        ProjectTestBST test = new ProjectTestBST("datafile.txt");
            test.bst.inorder(); //Calls inorder from BST.java
            test.bst.search("java"); //Calls search from BST.java
            test.bst.search("database"); //Calls search from BST.java
            
    }
    
    public ProjectTestBST(String filename) {
        try {
        
        bst = new BST<String>();
        fileReader = new BufferedReader(new FileReader(filename));

            while(readNextRecord()){} //Calls the readNextRecord method and iterates for as long as true is returned
            //readNextRecord();
         }
        catch(IOException e) {
            e.printStackTrace();
        }
        
    }


    public boolean readNextRecord(){
        if(fileReader == null) { //File not open
            System.out.println("Error: you must open the file first!");
            return false;
    }
        else {
    
        try { //Read the line
         String data = fileReader.readLine();

    if(data == null) //Line is not read
         return false;
            
        int titleId = Integer.parseInt(data); //Converts the string to integer
        String title = fileReader.readLine(); 
        String author = fileReader.readLine();
        int numKeys = Integer.parseInt(fileReader.readLine()); //Converts the string to integer

        Article article = new Article(titleId, title, author);
        //System.out.printf("%d %s %s %d\n", titleId, title, author, numKeys);

        String keyword;
      for(int i=0; i<numKeys; i++) {
        keyword = fileReader.readLine();
        bst.insert(keyword, article);
        }
        fileReader.readLine();
}

    catch(NumberFormatException e) { //If number format is incorrect
        System.out.println("Error: number expected!");
    return false;
 }
    catch(Exception e) { //To catch any exception of the Exception class

    System.out.println("Fatal Error: " + e);
        return false;

    }
  
            
        }
        return true;
    }
}