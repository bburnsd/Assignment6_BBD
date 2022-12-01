/**
 * @author bbdav
 * Depth First Search to search through a Tree
 */
public class DFS {       
       Node root;
       private int nodesTraversed;
       private int height = -1;
       
   /**
     * Default Constructor Method
     */
    public DFS()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }//end default constructor
    
        /**
         * This method has the user select the root node of a tree to do a Depth First Search
         * @param node  The root node of the tree
         */
        public void DFS(Node node)        {
        		   nodesTraversed++;
        		   
                   System.out.println("Node value: " + node.getData() + "\nNodes traversed: " + nodesTraversed);
                   if(node.getlChild() == null && node.getrChild() == null) {
                	   return;
                   }
                   DFS(node.getlChild());
                   DFS(node.getrChild());    
        }//end DFS
        
        /**
         * This method has the user input the root of a tree to find its height
         * @param node  The root node of the tree
         */
        public void getHeight(Node node) {
        	node.getlChild();
        	height++;
        	if(node.getlChild() == null) {
        		System.out.println("Height: " + height);
        		return;
        	}
        	getHeight(node.getlChild());
        }//end getHeight
}//end DFS class
