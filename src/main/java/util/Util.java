package util;


import model.Comp;
import model.Farm;
import model.Pipeline;
import model.Seq;
import model.Skeleton;
import pattern.skel2.Skel2Parser.AssignmentContext;

public class Util {

	public static Skeleton getType(String type, AssignmentContext ctx) {
		
		switch(type) {
		case "Seq":
			return new Seq(Long.parseLong(ctx.expr.seq.sec.ts.getText()));
		case "Comp":
			return new Comp(0);
		case "Farm":
			return new Farm(0);
		case "Pipe":
			return new Pipeline(0);
		case "Map":
			return new model.MapSkel(0);
		}
		return null;
	}
}
