package model;

public class Farm extends SkeletonModel{
	
	public Farm(long serviceTime) {
		this.serviceTime=serviceTime;
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

}
