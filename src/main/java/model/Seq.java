package model;

public class Seq extends SkeletonModel{
	
	public Seq(long serviceTime) {
		this.serviceTime = serviceTime;
	}
	@Override
	public int parallelismDegree() {
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
	@Override
	public long serviceTime() {
		
		return this.serviceTime;
	}

	@Override
	public long completionTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Seq [serviceTime=" + serviceTime + "]";
	}

}
