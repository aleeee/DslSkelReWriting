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

public class Node extends  JPanel{
	ArrayList<Node> children;
	Node parent;
	String lable;
	Skeleton skeleton;
	Node child;
	
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
		this.setLocation(500, 400);
        this.setSize(400, 200);
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
	@Override
	public void setInheritsPopupMenu(boolean value) {
		// TODO Auto-generated method stub
		super.setInheritsPopupMenu(value);
	}
	@Override
	public boolean getInheritsPopupMenu() {
		// TODO Auto-generated method stub
		return super.getInheritsPopupMenu();
	}
	@Override
	public void setComponentPopupMenu(JPopupMenu popup) {
		// TODO Auto-generated method stub
		super.setComponentPopupMenu(popup);
	}
	@Override
	public JPopupMenu getComponentPopupMenu() {
		// TODO Auto-generated method stub
		return super.getComponentPopupMenu();
	}
	@Override
	public void updateUI() {
		// TODO Auto-generated method stub
		super.updateUI();
	}
	@Override
	protected void setUI(ComponentUI newUI) {
		// TODO Auto-generated method stub
		super.setUI(newUI);
	}
	@Override
	public String getUIClassID() {
		// TODO Auto-generated method stub
		return super.getUIClassID();
	}
	@Override
	protected Graphics getComponentGraphics(Graphics g) {
		// TODO Auto-generated method stub
		return super.getComponentGraphics(g);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		
		
	}
	@Override
	protected void paintChildren(Graphics g) {
		// TODO Auto-generated method stub
		super.paintChildren(g);
	}
	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.paintBorder(g);
	}
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}
	@Override
	public void printAll(Graphics g) {
		// TODO Auto-generated method stub
		super.printAll(g);
	}
	@Override
	public void print(Graphics g) {
		// TODO Auto-generated method stub
		super.print(g);
	}
	@Override
	protected void printComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.printComponent(g);
	}
	@Override
	protected void printChildren(Graphics g) {
		// TODO Auto-generated method stub
		super.printChildren(g);
	}
	@Override
	protected void printBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.printBorder(g);
	}
	@Override
	public boolean isPaintingTile() {
		// TODO Auto-generated method stub
		return super.isPaintingTile();
	}
	@Override
	public boolean isManagingFocus() {
		// TODO Auto-generated method stub
		return super.isManagingFocus();
	}
	@Override
	public void setNextFocusableComponent(Component aComponent) {
		// TODO Auto-generated method stub
		super.setNextFocusableComponent(aComponent);
	}
	@Override
	public Component getNextFocusableComponent() {
		// TODO Auto-generated method stub
		return super.getNextFocusableComponent();
	}
	@Override
	public void setRequestFocusEnabled(boolean requestFocusEnabled) {
		// TODO Auto-generated method stub
		super.setRequestFocusEnabled(requestFocusEnabled);
	}
	@Override
	public boolean isRequestFocusEnabled() {
		// TODO Auto-generated method stub
		return super.isRequestFocusEnabled();
	}
	@Override
	public void requestFocus() {
		// TODO Auto-generated method stub
		super.requestFocus();
	}
	@Override
	public boolean requestFocus(boolean temporary) {
		// TODO Auto-generated method stub
		return super.requestFocus(temporary);
	}
	@Override
	public boolean requestFocusInWindow() {
		// TODO Auto-generated method stub
		return super.requestFocusInWindow();
	}
	@Override
	protected boolean requestFocusInWindow(boolean temporary) {
		// TODO Auto-generated method stub
		return super.requestFocusInWindow(temporary);
	}
	@Override
	public void grabFocus() {
		// TODO Auto-generated method stub
		super.grabFocus();
	}
	@Override
	public void setVerifyInputWhenFocusTarget(boolean verifyInputWhenFocusTarget) {
		// TODO Auto-generated method stub
		super.setVerifyInputWhenFocusTarget(verifyInputWhenFocusTarget);
	}
	@Override
	public boolean getVerifyInputWhenFocusTarget() {
		// TODO Auto-generated method stub
		return super.getVerifyInputWhenFocusTarget();
	}
	@Override
	public FontMetrics getFontMetrics(Font font) {
		// TODO Auto-generated method stub
		return super.getFontMetrics(font);
	}
	@Override
	public void setPreferredSize(Dimension preferredSize) {
		// TODO Auto-generated method stub
		super.setPreferredSize(preferredSize);
	}
	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return super.getPreferredSize();
	}
	@Override
	public void setMaximumSize(Dimension maximumSize) {
		// TODO Auto-generated method stub
		super.setMaximumSize(maximumSize);
	}
	@Override
	public Dimension getMaximumSize() {
		// TODO Auto-generated method stub
		return super.getMaximumSize();
	}
	@Override
	public void setMinimumSize(Dimension minimumSize) {
		// TODO Auto-generated method stub
		super.setMinimumSize(minimumSize);
	}
	@Override
	public Dimension getMinimumSize() {
		// TODO Auto-generated method stub
		return super.getMinimumSize();
	}
	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return super.contains(x, y);
	}
	@Override
	public void setBorder(Border border) {
		// TODO Auto-generated method stub
		super.setBorder(border);
	}
	@Override
	public Border getBorder() {
		// TODO Auto-generated method stub
		return super.getBorder();
	}
	@Override
	public Insets getInsets() {
		// TODO Auto-generated method stub
		return super.getInsets();
	}
	@Override
	public Insets getInsets(Insets insets) {
		// TODO Auto-generated method stub
		return super.getInsets(insets);
	}
	@Override
	public float getAlignmentY() {
		// TODO Auto-generated method stub
		return super.getAlignmentY();
	}
	@Override
	public void setAlignmentY(float alignmentY) {
		// TODO Auto-generated method stub
		super.setAlignmentY(alignmentY);
	}
	@Override
	public float getAlignmentX() {
		// TODO Auto-generated method stub
		return super.getAlignmentX();
	}
	@Override
	public void setAlignmentX(float alignmentX) {
		// TODO Auto-generated method stub
		super.setAlignmentX(alignmentX);
	}
	@Override
	public void setInputVerifier(InputVerifier inputVerifier) {
		// TODO Auto-generated method stub
		super.setInputVerifier(inputVerifier);
	}
	@Override
	public InputVerifier getInputVerifier() {
		// TODO Auto-generated method stub
		return super.getInputVerifier();
	}
	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return super.getGraphics();
	}
	@Override
	public void setDebugGraphicsOptions(int debugOptions) {
		// TODO Auto-generated method stub
		super.setDebugGraphicsOptions(debugOptions);
	}
	@Override
	public int getDebugGraphicsOptions() {
		// TODO Auto-generated method stub
		return super.getDebugGraphicsOptions();
	}
	@Override
	public void registerKeyboardAction(ActionListener anAction, String aCommand, KeyStroke aKeyStroke, int aCondition) {
		// TODO Auto-generated method stub
		super.registerKeyboardAction(anAction, aCommand, aKeyStroke, aCondition);
	}
	@Override
	public void registerKeyboardAction(ActionListener anAction, KeyStroke aKeyStroke, int aCondition) {
		// TODO Auto-generated method stub
		super.registerKeyboardAction(anAction, aKeyStroke, aCondition);
	}
	@Override
	public void unregisterKeyboardAction(KeyStroke aKeyStroke) {
		// TODO Auto-generated method stub
		super.unregisterKeyboardAction(aKeyStroke);
	}
	@Override
	public KeyStroke[] getRegisteredKeyStrokes() {
		// TODO Auto-generated method stub
		return super.getRegisteredKeyStrokes();
	}
	@Override
	public int getConditionForKeyStroke(KeyStroke aKeyStroke) {
		// TODO Auto-generated method stub
		return super.getConditionForKeyStroke(aKeyStroke);
	}
	@Override
	public ActionListener getActionForKeyStroke(KeyStroke aKeyStroke) {
		// TODO Auto-generated method stub
		return super.getActionForKeyStroke(aKeyStroke);
	}
	@Override
	public void resetKeyboardActions() {
		// TODO Auto-generated method stub
		super.resetKeyboardActions();
	}
	@Override
	public int getBaseline(int width, int height) {
		// TODO Auto-generated method stub
		return super.getBaseline(width, height);
	}
	@Override
	public BaselineResizeBehavior getBaselineResizeBehavior() {
		// TODO Auto-generated method stub
		return super.getBaselineResizeBehavior();
	}
	@Override
	public boolean requestDefaultFocus() {
		// TODO Auto-generated method stub
		return super.requestDefaultFocus();
	}
	@Override
	public void setVisible(boolean aFlag) {
		// TODO Auto-generated method stub
		super.setVisible(aFlag);
	}
	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setEnabled(enabled);
	}
	@Override
	public void setForeground(Color fg) {
		// TODO Auto-generated method stub
		super.setForeground(fg);
	}
	@Override
	public void setBackground(Color bg) {
		// TODO Auto-generated method stub
		super.setBackground(bg);
	}
	@Override
	public void setFont(Font font) {
		// TODO Auto-generated method stub
		super.setFont(font);
	}
	@Override
	protected void processComponentKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
		super.processComponentKeyEvent(e);
	}
	@Override
	protected void processKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
		super.processKeyEvent(e);
	}
	@Override
	protected boolean processKeyBinding(KeyStroke ks, KeyEvent e, int condition, boolean pressed) {
		// TODO Auto-generated method stub
		return super.processKeyBinding(ks, e, condition, pressed);
	}
	@Override
	public void setToolTipText(String text) {
		// TODO Auto-generated method stub
		super.setToolTipText(text);
	}
	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return super.getToolTipText();
	}
	@Override
	public String getToolTipText(MouseEvent event) {
		// TODO Auto-generated method stub
		return super.getToolTipText(event);
	}
	@Override
	public Point getToolTipLocation(MouseEvent event) {
		// TODO Auto-generated method stub
		return super.getToolTipLocation(event);
	}
	@Override
	public Point getPopupLocation(MouseEvent event) {
		// TODO Auto-generated method stub
		return super.getPopupLocation(event);
	}
	@Override
	public JToolTip createToolTip() {
		// TODO Auto-generated method stub
		return super.createToolTip();
	}
	@Override
	public void scrollRectToVisible(Rectangle aRect) {
		// TODO Auto-generated method stub
		super.scrollRectToVisible(aRect);
	}
	@Override
	public void setAutoscrolls(boolean autoscrolls) {
		// TODO Auto-generated method stub
		super.setAutoscrolls(autoscrolls);
	}
	@Override
	public boolean getAutoscrolls() {
		// TODO Auto-generated method stub
		return super.getAutoscrolls();
	}
	@Override
	public void setTransferHandler(TransferHandler newHandler) {
		// TODO Auto-generated method stub
		super.setTransferHandler(newHandler);
	}
	@Override
	public TransferHandler getTransferHandler() {
		// TODO Auto-generated method stub
		return super.getTransferHandler();
	}
	@Override
	protected void processMouseEvent(MouseEvent e) {
		// TODO Auto-generated method stub
		super.processMouseEvent(e);
	}
	@Override
	protected void processMouseMotionEvent(MouseEvent e) {
		// TODO Auto-generated method stub
		super.processMouseMotionEvent(e);
	}
	@Override
	public void enable() {
		// TODO Auto-generated method stub
		super.enable();
	}
	@Override
	public void disable() {
		// TODO Auto-generated method stub
		super.disable();
	}
	@Override
	public void setFocusTraversalKeys(int id, Set<? extends AWTKeyStroke> keystrokes) {
		// TODO Auto-generated method stub
		super.setFocusTraversalKeys(id, keystrokes);
	}
	@Override
	public void reshape(int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		super.reshape(x, y, w, h);
	}
	@Override
	public Rectangle getBounds(Rectangle rv) {
		// TODO Auto-generated method stub
		return super.getBounds(rv);
	}
	@Override
	public Dimension getSize(Dimension rv) {
		// TODO Auto-generated method stub
		return super.getSize(rv);
	}
	@Override
	public Point getLocation(Point rv) {
		// TODO Auto-generated method stub
		return super.getLocation(rv);
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}
	@Override
	public boolean isOpaque() {
		// TODO Auto-generated method stub
		return super.isOpaque();
	}
	@Override
	public void setOpaque(boolean isOpaque) {
		// TODO Auto-generated method stub
		super.setOpaque(isOpaque);
	}
	@Override
	public void computeVisibleRect(Rectangle visibleRect) {
		// TODO Auto-generated method stub
		super.computeVisibleRect(visibleRect);
	}
	@Override
	public Rectangle getVisibleRect() {
		// TODO Auto-generated method stub
		return super.getVisibleRect();
	}
	@Override
	public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}
	@Override
	public void firePropertyChange(String propertyName, int oldValue, int newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}
	@Override
	public void firePropertyChange(String propertyName, char oldValue, char newValue) {
		// TODO Auto-generated method stub
		super.firePropertyChange(propertyName, oldValue, newValue);
	}
	@Override
	protected void fireVetoableChange(String propertyName, Object oldValue, Object newValue)
			throws PropertyVetoException {
		// TODO Auto-generated method stub
		super.fireVetoableChange(propertyName, oldValue, newValue);
	}
	@Override
	public synchronized void addVetoableChangeListener(VetoableChangeListener listener) {
		// TODO Auto-generated method stub
		super.addVetoableChangeListener(listener);
	}
	@Override
	public synchronized void removeVetoableChangeListener(VetoableChangeListener listener) {
		// TODO Auto-generated method stub
		super.removeVetoableChangeListener(listener);
	}
	@Override
	public synchronized VetoableChangeListener[] getVetoableChangeListeners() {
		// TODO Auto-generated method stub
		return super.getVetoableChangeListeners();
	}
	@Override
	public Container getTopLevelAncestor() {
		// TODO Auto-generated method stub
		return super.getTopLevelAncestor();
	}
	@Override
	public void addAncestorListener(AncestorListener listener) {
		// TODO Auto-generated method stub
		super.addAncestorListener(listener);
	}
	@Override
	public void removeAncestorListener(AncestorListener listener) {
		// TODO Auto-generated method stub
		super.removeAncestorListener(listener);
	}
	@Override
	public AncestorListener[] getAncestorListeners() {
		// TODO Auto-generated method stub
		return super.getAncestorListeners();
	}
	@Override
	public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
		// TODO Auto-generated method stub
		return super.getListeners(listenerType);
	}
	@Override
	public void addNotify() {
		// TODO Auto-generated method stub
		super.addNotify();
	}
	@Override
	public void removeNotify() {
		// TODO Auto-generated method stub
		super.removeNotify();
	}
	@Override
	public void repaint(long tm, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.repaint(tm, x, y, width, height);
	}
	@Override
	public void repaint(Rectangle r) {
		// TODO Auto-generated method stub
		super.repaint(r);
	}
	@Override
	public void revalidate() {
		// TODO Auto-generated method stub
		super.revalidate();
	}
	@Override
	public boolean isValidateRoot() {
		// TODO Auto-generated method stub
		return super.isValidateRoot();
	}
	@Override
	public boolean isOptimizedDrawingEnabled() {
		// TODO Auto-generated method stub
		return super.isOptimizedDrawingEnabled();
	}
	@Override
	protected boolean isPaintingOrigin() {
		// TODO Auto-generated method stub
		return super.isPaintingOrigin();
	}
	@Override
	public void paintImmediately(int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		super.paintImmediately(x, y, w, h);
	}
	@Override
	public void paintImmediately(Rectangle r) {
		// TODO Auto-generated method stub
		super.paintImmediately(r);
	}
	@Override
	public void setDoubleBuffered(boolean aFlag) {
		// TODO Auto-generated method stub
		super.setDoubleBuffered(aFlag);
	}
	@Override
	public boolean isDoubleBuffered() {
		// TODO Auto-generated method stub
		return super.isDoubleBuffered();
	}
	@Override
	public JRootPane getRootPane() {
		// TODO Auto-generated method stub
		return super.getRootPane();
	}
	@Override
	protected String paramString() {
		// TODO Auto-generated method stub
		return super.paramString();
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		super.hide();
	}
	
	
	
}
