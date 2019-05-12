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
	public long serviceTime() {
		
		return this.serviceTime;
	}

	@Override
	public long completionTime() {
		// TODO Auto-generated method stub
		return 0;
	}

}
