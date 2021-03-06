package tree;

import java.util.ArrayList;
import model.Skeleton;

public class Node implements Skeleton{
	ArrayList<Node> children;
	Node parent;
	String lable;
	Skeleton skeleton;
	Node child;
	long serviceTime;
	
	public Skeleton getSkeleton() {
		return skeleton;
	}
	public void setSkeleton(Skeleton skeleton) {
		this.skeleton = skeleton;
	}
	public Node getChild() {
		return child;
	}
	public void setChild(Node child) {
		this.child = child;
	}
	public Node(String lable, Skeleton s) {
		super();
		this.lable = lable;
		this.skeleton=s;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	@Override
	public String toString() {
		return "Node [ lable=" + lable + ", skeleton=" + skeleton
				+ ", child=" + child + " +children=" + children +"]";
	}
	@Override
	public int parallelismDegree() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long serviceTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long completionTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setServiceTime(long ts) {
		// TODO Auto-generated method stub
		
	}
	}
