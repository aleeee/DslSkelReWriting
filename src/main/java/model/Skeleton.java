package model;

public interface Skeleton {
	int parallelismDegree();
	long serviceTime();
	long completionTime();
	void setServiceTime(long ts);

}
