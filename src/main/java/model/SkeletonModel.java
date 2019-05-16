package model;

public abstract class SkeletonModel implements Skeleton {
	long serviceTime;

	public long getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(long serviceTime) {
		this.serviceTime = serviceTime;
	}
	
}
