package pattern;

import model.Comp;
import model.Farm;
import model.MapSkel;
import model.Pipeline;
import model.Seq;

public class SkeletonPattern {

    public static SkeletonPattern VOID = new SkeletonPattern(new Object());

    final Object value;
    
    public SkeletonPattern(Object value) {
        this.value = value;
    }

    public Farm asFarm() {
        return (Farm)value;
    }

    public Pipeline asPipeline() {
        return (Pipeline)value;
    }

    public Seq asSeq() {
        return (Seq)value;
    }

    public MapSkel asMap() {
        return (MapSkel)value;
    }
    public Comp asComp() {
        return (Comp)value;
    }
    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        SkeletonPattern that = (SkeletonPattern)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
