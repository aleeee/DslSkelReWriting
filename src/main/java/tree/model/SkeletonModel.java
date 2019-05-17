package tree.model;

public abstract class SkeletonModel implements SkeletonPatt {
	long serviceTime;

	public long getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(long serviceTime) {
		this.serviceTime = serviceTime;
	}
	
}
