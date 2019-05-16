package util;


import model.Comp;
import model.Farm;
import model.Pipeline;
import model.Seq;
import model.Skeleton;
import pattern.skel3.Skel3Parser.AssignmentContext;
import tree.Node;

public class Util {

	public static Skeleton getType(AssignmentContext ctx) {
		
		switch(ctx.varType().getText()) {
		case "Seq":
//			return new Seq(ctx.expr.se);
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
	public static Skeleton getType(String ctx) {
		return null;
	}
	
	public static long computeServiceTime(Node n,long ts) {
		System.out.println(n + " sk " + ts);
		if(n.getChild() != null) {
			ts = ts+ computeServiceTime(n.getChild(),ts);
		}else if(n.getChildren() != null) {
			
			for(Node c : n.getChildren()) {
				ts = computeServiceTime(c, ts);
			}
		}else {
			ts= ts+n.getSkeleton().serviceTime();
		}
		return ts;
	}

}
