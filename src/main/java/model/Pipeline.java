package model;

public class Pipeline extends SkeletonModel {
	
	public Pipeline(long serviceTime) {
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
	public String toString() {
		return "Pipeline [serviceTime=" + serviceTime + ", parallelismDegree()=" + parallelismDegree()
				+ ", serviceTime()=" + serviceTime() + ", completionTime()=" + completionTime() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
