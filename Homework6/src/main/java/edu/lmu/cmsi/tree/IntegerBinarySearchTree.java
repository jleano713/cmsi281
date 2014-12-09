package edu.lmu.cmsi.tree;

import edu.lmu.cmsi.tree.node.BinaryTreeNode;
import edu.lmu.cmsi.tree.exception.*;
import java.util.*;

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
  public void insert(int value) {
  	this.root = insert(this.root, value);
  }
  
  private BinaryTreeNode insert(BinaryTreeNode current, int value) {
    if (current == null) {
    	return new BinaryTreeNode(value);
    }
    if (current.getValue() == value) {
    	throw new DuplicateItemException();
    }
    else if (current.getValue() > value) {
    	current.setLeft(insert(current.getLeft(), value));
    }
    else {
    	current.setRight(insert(current.getRight(), value));
    }
    return current;
  }

  /**
   * Find the smallest item in the tree.
   *
   * @return smallest item or throws an exception if the tree is empty.
   * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
   *
   */
  public int findSmallestValue() {
  	BinaryTreeNode current = root;
    if (root == null) {
    	throw new ItemNotFoundException();
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
    BinaryTreeNode current = root;
    if (root == null) {
    	throw new ItemNotFoundException();
    }
    else {
     	while (current.getRight() != null) {
    		current = current.getRight();
    	}
    	return current.getValue();
    }
  }

  /**
   * Returns whether or not the value exists in the tree
   *
   * @return true if the value exists, false otherwise
   */
  public boolean contains(int value) {
	return contains(root, value);
  }
  
  private boolean contains(BinaryTreeNode current, int x) {
  	if (current == null) {
  		return false;
  	}
  	if (current.getValue() == x) {
  		return true;
  	}
  	else if (current.getValue() > x) {
  		return this.contains(current.getLeft(), x);
  	}
  	else {
  		return contains(current.getRight(), x);
  	}
  }

  /**
   * Returns an preorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toPreOrder() {
    ArrayList<Integer> temp = toPreOrder(this.root);
    Integer[] array = new Integer[temp.size()];
    for (int i = 0; i < temp.size(); i++) {
    	array[i] = temp.get(i);
    }
    return array;
  }
  
  private ArrayList<Integer> toPreOrder(BinaryTreeNode current) {
  	ArrayList<Integer> temp = new ArrayList<Integer>();
  	if (current == null) {
  		return temp;
  	}
  	temp.add(current.getValue());
  	temp.addAll(toPreOrder(current.getLeft()));
  	temp.addAll(toPreOrder(current.getRight()));
  	return temp;
  }

  /**
   * Returns an inorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toInOrder() {
    ArrayList<Integer> temp = toInOrder(this.root);
    Integer[] array = new Integer[temp.size()];
    for (int i = 0; i < temp.size(); i++) {
    	array[i] = temp.get(i);
    }
    return array;
  }
  
  private ArrayList<Integer> toInOrder(BinaryTreeNode current) {
  	ArrayList<Integer> temp = new ArrayList<Integer>();
  	if (current == null) {
  		return temp;
  	}
  	temp.addAll(toInOrder(current.getLeft()));
  	temp.add(current.getValue());
  	temp.addAll(toInOrder(current.getRight()));
  	return temp;
  }

  /**
   * Returns an postorder-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toPostOrder() {
    ArrayList<Integer> temp = toPostOrder(this.root);
    Integer[] array = new Integer[temp.size()];
    for (int i = 0; i < temp.size(); i++) {
    	array[i] = temp.get(i);
    }
    return array;
  }
  
  private ArrayList<Integer> toPostOrder(BinaryTreeNode current) {
  	ArrayList<Integer> temp = new ArrayList<Integer>();
  	if (current == null) {
  		return temp;
  	}
  	temp.addAll(toPostOrder(current.getLeft()));
  	temp.addAll(toPostOrder(current.getRight()));
  	temp.add(current.getValue());
  	return temp;
  }

  /**
   * Returns an Breadth First-traversed array
   *
   * @return an array of Integers, or empty if the tree is empty.
   */
  public Integer[] toBreadthFirstOrder() {
    ArrayList<Integer> temp = toBreadthFirstOrder(this.root);
    Integer[] array = new Integer[temp.size()];
    for (int i = 0; i < temp.size(); i++) {
    	array[i] = temp.get(i);
    }
    return array;
  }
  
  private ArrayList<Integer> toBreadthFirstOrder(BinaryTreeNode current) {
  	Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
  	ArrayList<Integer> temp = new ArrayList<Integer>();
  	if (current == null) {
  		return temp;
  	}
  	queue.add(current);
  	while (!(queue.isEmpty())) {
  		BinaryTreeNode node = queue.remove();
  		temp.add(node.getValue());
  		if (node != null) {
  			if (node.getLeft() != null) {
  				queue.add(node.getLeft());
  			}
  			if (node.getRight() != null) {
  				queue.add(node.getRight());
  			}
  		}
  	}
  	return temp;
  }
    
}