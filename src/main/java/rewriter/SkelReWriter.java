package rewriter;

import java.util.ArrayList;

import tree.model.CompPatt;
import tree.model.FarmPatt;
import tree.model.MapPatt;
import tree.model.PipePatt;
import tree.model.SeqPatt;
import tree.model.SkeletonPatt;

public class SkelReWriter implements ReWriter {
	private int n = 4;

	@Override
	public void reWrite(SeqPatt s) {
		ArrayList<SkeletonPatt> patterns = new ArrayList<>();
		// farm intro
		FarmPatt farm = new FarmPatt("farm", s.serviceTime() / n);
		farm.setChild(s);
		patterns.add(farm);
		// map intro
		MapPatt map = new MapPatt("map", s.serviceTime() / n);
		map.setChild(s);
		patterns.add(map);
		s.setPatterns(patterns);

	}

	@Override
	public void reWrite(CompPatt s) {
		// pipe intro
		// farm intro
		// for each stage
		// rewrite
	}

	@Override
	public void reWrite(FarmPatt s) {
		// farm elim
		// rewrite child
	}

	@Override
	public void reWrite(PipePatt s) {
		// pipe elim
		// farm intro
		// for each stage
		// rewrite
	}

	@Override
	public void reWrite(MapPatt s) {
		// farm intro
		//
	}

}
