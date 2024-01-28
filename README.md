# BSTs

In this project, our goal was to implement a binary search tree and integrate it with a linkedList in order to create an information retrieval system. sort the tree based on the properties of BST organization, as well as storing additional information that is specific for each individual tree node. 

-datafile.txt 
This was the file we needed to read the elements from to insert those elements into the tree, while also not violating the properties of a BST. Specifically, the file contained the names of different books with keywords, ranging from “blobs” to “weighting” associated with them. These keywords are going to help make up the alphabetic portion of sorting our BST. Because of the txt file’s encoding scheme, all the words in the file are initially processed as strings, which we handle the conversion in ProjectTestBST.

-BST.java
For this file, we needed a variety of methods to carry out CRUD operations, but the most prominent one we used for this particular project was the search() method (Retrieve in CRUD). The reason we wanted to use the search method was to find a keyword that matched to a particular article in the data file. The search() method is implemented by traversing the tree (O(n)) from the root and navigating by using the well-known property of a binary search tree: the left child TreeNode is always less that the parent TreeNode and the right child TreeNode is always greater than the parent. In this project, the ASCII values of the letters of the keywords from the file were compared in order to maintain the BST property. For example, the blobs keyword would be somewhere left of the medical keyword and the pruning keyword would be somewhere right of medical. 

-Node.java
For this file, the purpose was to define what a linked list type node will be in the project. The Node<E> class is of self referential recursive architecture, meaning that there is a data field in the class Node<E> of type Node<E>. For every time we want to add a new node to the tree, we use the new keyword. Since it has a generic symbol (<E>), it will allow us to create nodes of type Article.

-TreeNode.java
This file describes the elements of each node for a binary search tree. Keep in mind that the elements from the TreeNode class are different than from the elements from the Node class. However, this is where we get to associate a LinkedList node to a BST node. See, each tree node will also include a node containing the Article elements (id, title, author). In order to add these “differentiating information” nodes to the tree node, we use the important addFirst() method. This will essentially link the “books” to the keywords that they are associated with in the BST.

-Article.java
For this file, we are implementing the elements of each book (id, title, author) to be “attached” through a linkedList to the keyword TreeNodes. ID, title, and author are what differentiate each book.

-ProjectTestBST.java
This file is where we get to insert keywords into BST. Since all of the individual different “books” from the data file had multiple keywords, all of them appeared more than once when the inorder() was called. The first search method, search(“java”), was used to look for a “book” that had the keyword “java.” Since none of the books from the data file have a “java” keyword, we printed to the use that there is no such keyword found in the information database. The second search method, search(“database”), was used to look for a “book” that had the keyword “database.” There were 11 books with that keyword, so those 11 books’s id, author, and titles were all printed. In this file, we used a lot of try/catch blocks for exception handling. This is because we need to compensate and prepare to handle cases where the file does not open or if the reading of the file does not happen. When reading the file, we needed to parse the ID Strings from the data file into int type data. The title and author Strings were fine to use the readLine() method due to no conversion needed.
