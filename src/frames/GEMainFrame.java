package frames;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import constants.GEConstants;
import menus.GEMenuBar;

public class GEMainFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GEDrawingPanel drawingPanel;
	private GEMenuBar menuBar;
	private GEToolbar toolBar;
	
	public GEMainFrame(String title){
		super(title);
		
		drawingPanel = new GEDrawingPanel();
		add(drawingPanel);
		
		menuBar = new GEMenuBar();
		setJMenuBar(menuBar); 
		
		toolBar = new GEToolbar(GEConstants.TITLE_SHAPETOOLBAR);
		add(BorderLayout.NORTH, toolBar);
	}
	
	public void init(){
		toolBar.init(drawingPanel);
		menuBar.init(drawingPanel);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(GEConstants.WIDTH_MAINFRAME, 
						GEConstants.HEIGHT_MAINFRAME);
		this.setVisible(true);
	}
}
