package model;

import visitor.NodeVisitor;
import visitor.Visitable;

public class Comp extends SkeletonModel implements Visitable{
	
	public Comp(long serviceTime) {
		this.serviceTime = serviceTime;
	}
	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
		
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
	public long getServiceTime() {
		// TODO Auto-generated method stub
		return super.getServiceTime();
	}
	@Override
	public void setServiceTime(long serviceTime) {
		// TODO Auto-generated method stub
		super.setServiceTime(serviceTime);
	}
	

}
