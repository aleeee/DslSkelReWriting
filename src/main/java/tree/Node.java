package tree;

import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Set;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.JToolTip;
import javax.swing.KeyStroke;
import javax.swing.TransferHandler;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ComponentUI;

import model.Skeleton;

public class Node{
	ArrayList<Node> children;
	Node parent;
	String lable;
	Skeleton skeleton;
	Node child;
	long serviceTime;
	
	public Skeleton getSkeleton() {
		return skeleton;
	}
	public void setSkeleton(Skeleton skeleton) {
		this.skeleton = skeleton;
	}
	public Node getChild() {
		return child;
	}
	public void setChild(Node child) {
		this.child = child;
	}
	public Node(String lable, Skeleton s) {
		super();
		this.lable = lable;
		this.skeleton=s;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	@Override
	public String toString() {
		return "Node [ lable=" + lable + ", skeleton=" + skeleton
				+ ", child=" + child + " +children=" + children +"]";
	}
	}
