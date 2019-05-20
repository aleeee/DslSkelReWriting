package tree.model;

import java.util.ArrayList;

import model.Skeleton;
import visitor.NodeVisitor;
import visitor.Visitable;

public class PipePatt implements SkeletonPatt, Visitable {

	ArrayList<SkeletonPatt> children;
	SkeletonPatt parent;
	String lable;
	SkeletonPatt child;
	long serviceTime;

	public PipePatt(String lable, long serviceTime) {
		super();
		this.lable = lable;
		this.serviceTime = serviceTime;
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
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);

	}

	@Override
	public void setServiceTime(long ts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<SkeletonPatt> getChildren() {
		return children;
	}

	@Override
	public String getLable() {
		return lable;
	}

	@Override
	public SkeletonPatt getChild() {
		return child;
	}

	public SkeletonPatt getParent() {
		return parent;
	}

	public void setParent(SkeletonPatt parent) {
		this.parent = parent;
	}

	public long getServiceTime() {
		return serviceTime;
	}

	public void setChildren(ArrayList<SkeletonPatt> children) {
		this.children = children;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public void setChild(SkeletonPatt child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "PipePatt [children=" + children + ", parent=" + parent + ", lable=" + lable + ", child=" + child
				+ ", serviceTime=" + serviceTime + "]";
	}

	
}
