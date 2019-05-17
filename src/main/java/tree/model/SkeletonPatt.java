package tree.model;

import java.util.ArrayList;



public interface SkeletonPatt {
	int parallelismDegree();
	long serviceTime();
	long completionTime();
	void setServiceTime(long ts);
	public ArrayList<SkeletonPatt> getChildren();
	public String getLable() ;
	public SkeletonPatt getChild() ;

}
