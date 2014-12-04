package edu.lmu.cmsi.tree;

import edu.lmu.cmsi.tree.node.BinaryTreeNode;
import edu.lmu.cmsi.tree.exception.*;

public class IntegerBinarySearchTree {

  protected BinaryTreeNode root;

  public IntegerBinarySearchTree() {
    this.root = null;
  }

  /**
   * Insert into the tree.
   *
   * @param x the item to insert.
   * @throws edu.lmu.cmsi.tree.exception.DuplicateItemException if x exists.
   */
  public void insert(int x) {
    BinaryTreeNode temp = new BinaryTreeNode(x);
    BinaryTreeNode current = root;
    if (current == null) {
    	current = new BinaryTreeNode(x);
    }
    else {	
    	if (current.getValue() == x) {
    		throw new DuplicateItemException();
    	}
    	else if (current.getValue() > x) {
    		if (current.getLeft() == null) {
    			current.getLeft().setLeft(temp);
    		}
    		else {
    			while (current.getLeft() != null) {
    				current = current.getLeft();
    			}
    			current.getLeft().setLeft(temp);
    		}
    	}
    	else {
    		if (current.getRight() == null) {
    			current.getRight().setLeft(temp);
    		}
    		else {
    			while (current.getRight() != null) {	
    				current = current.getRight();
    			}
    			current.getRight().setRight(temp);
    		}
   		 }
   	}
  }

  /**
   * Find the smallest item in the tree.
   *
   * @return smallest item or throws an exception if the tree is empty.
   * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
   *
   */
  public int findSmallestValue() {
    if (root == null) {
    	throw new ItemNotFoundException();
    }
    BinaryTreeNode current = root;
    if (current.getLeft() == null) {
    	return current.getValue();
    }
    else {
    	while (current.getLeft() != null) {
    		current = current.getLeft();
    	}
    return current.getValue();
    }
  }

  /**
   * Find the largest item in the tree.
   *
   * @return the largest item or throws an exception if the tree is empty.
   * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
   *
   */
  public int findLargestValue() {
    if (root == null) {
    	throw new ItemNotFoundException();
    }
    BinaryTreeNode current = root;
    while (current.getRight() != null) {
    	current = current.getRight();
    }
    return current.getValue();
  }

  /**
   * Returns whether or not the value exists in the tree
   *
   * @return true if the value exists, false otherwise
   */
  public boolean contains(int value) {
	if (root == null) {
		return false;
	}
	BinaryTreeNode current = root;
	if (current.getValue() == value) {
		return true;
	}
	if (current.getValue() > value) {
		while (current != null) {
			if (current.getLeft().getValue() == value) {
				return true;
			}
			current = current.getLeft();
		}
		return false;
	}
	else {
		while (current != null) {
			if (current.getRight().getValue() == value) {
				return true;
			}
			current = current.getRight();
		}
		return false;
	}
  }

  /**
   * Returns an preorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toPreOrder() {
    throw new UnsupportedOperationException("toPreOrder needs to be implemented");
  }

  /**
   * Returns an inorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toInOrder() {
    throw new UnsupportedOperationException("toInOrder needs to be implemented");
  }

  /**
   * Returns an postorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toPostOrder() {
    throw new UnsupportedOperationException("toPostOrder needs to be implemented");
  }

  /**
   * Returns an Breadth First-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toBreadthFirstOrder() {
    throw new UnsupportedOperationException("toBreadthFirstOrder needs to be implemented");
  }
}