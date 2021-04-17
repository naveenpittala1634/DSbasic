/*
 * There are two types of traversal :
 1) Breadth First Traversal (also known as Level order traversal )
 
 2) Depth First Traversal -> Inorder, Preorder, PostOrder
 
 
 
 Here we have performed 
 i) insert operations
 ii) find operation  --> Returns true if the element is found in the tree
 iii)inorder traversal --> Left Root Right
 iv) preorder traversal--> Root Left Right
 v) postorder traversal--> Left Right Root
 */

package BinaryTrees;

public class Tree
{
		 class Node
		{
			int value;
			Node leftChild;
			Node rightChild;
			public Node(int value)
			{
				this.value=value;
				leftChild = rightChild = null; 
				 
			}
			
			
		}
		Node root;
      public void insert(int value)
      {
    	  Node node=new Node(value);
    	  if(root==null)
    	  {
    		  root=node;
    		  return;
    	  }
    	  Node current=root;
    	  while(true)
    	  {
    		  if(value<current.value)
    		  {
    			  if(current.leftChild==null)
    			  {
    				  current.leftChild=node;
    				  break;
    			  }
    			  current=current.leftChild;	  
    		  }
    		  else
    		  {
    			  if(current.rightChild==null)
    			  {
    				  current.rightChild=node;
    				  break;
    			  }
    			  current=current.rightChild;
    		  }
    	  }
    	  
    	  
    	  
      }
  
    	   public void inOrder(Node root)
    	    { 
    		   if(root==null)
       	        return;
    	        inOrder(root.leftChild);
    	       
    	        System.out.println(root.value+" ");
    	        inOrder(root.rightChild);
    	        

    	    }
    	   public void preOrder(Node root)
    	   {
    		   if(root==null)
          	        return;
    		   System.out.println(root.value+" ");
       	        preOrder(root.leftChild);
       	       
       	       
       	        preOrder(root.rightChild);
    		   
    	   }
    	   
    	   public void postOrder(Node root)
    	   {
    		   if(root==null)
          	        return;
    		 
    		   
       	        postOrder(root.leftChild);
       	        postOrder(root.rightChild);
       	       
       	       
       	     System.out.println(root.value+" ");
    		   
    	   }
    	   public boolean find(int item)
    	   {
    		   Node current=root;
    		   while(current!=null)
    		   {
    			   if(item<current.value)
    				   current=current.leftChild;
    			   else if(item>current.value)
    				   current=current.rightChild;
    			   else
    				   return true;
    		   }
    		   return false;
    	   }
      
public static void main(String[] args)
  	{
  		Tree tree=new Tree();
  		tree.insert(7);
  		tree.insert(4);
  		tree.insert(9);
  		tree.insert(1);
  		tree.insert(6);
  		tree.insert(8);
  		tree.insert(10);
  		System.out.println("Inorder is ");
  		tree.inOrder(tree.root);
  		System.out.println("Preorder is ");
		tree.preOrder(tree.root);
		System.out.println("Postorder is ");
		tree.postOrder(tree.root);
		System.out.println(tree.find(12));
  	
  		
  		
  		
  	}
		
      
}
	


