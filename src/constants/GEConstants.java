package constants;

import java.awt.Color;

public class GEConstants {
	//GEMainFrame
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "GE-final";
	//GEMenu
	public static final String TITLE_FILEMENU = "����";
	public static final String TITLE_EDITMENU = "����";
	public static final String TITLE_COLORMENU = "�÷�";
	//GEMenuItems
	public static enum EFileMenuItems {���θ����, ����, ����, �ٸ��̸���������, ����}
	public static enum EEditMenuItems {Undo, Redo, ����, �߶󳻱�, ����, ���̱�, �׷�, �׷�����}
	public static enum EColorMenuItems {SetLineColor, ClearLineColor, SetFillColor, ClearFillColor}
	
	//GEToolbar
	public static final String TITLE_SHAPETOOLBAR = "Shapes Tools";
	public static enum EToolBarButtons {Select, Rectangle, Line, Ellipse, polygon}
	public static final String IMG_URL = "images/";
	public static final String TOOLBAR_BTN = ".gif";
	public static final String TOOLBAR_BTN_SLT = "SLT.gif";
	
	//GEDrawingPanel
	public static final Color FOREGROUND_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
	public static enum EState {Idle, TwoPointsDrawing, NPointsDrawing, Moving, Resizer, Selecting, Paste}
	public final static Color COLOR_LINE_DEFAULT = Color.black;
	public final static Color COLOR_FILL_DEFAULT = Color.white;
	
	//GEAnchorList
	public static final int ANCHOR_W = 6;
	public static final int ANCHOR_H = 6;
	public static final int RR_OFFSET = 30;
	public static final Color ANCHOR_LINECOLOR = Color.BLACK;
	public static final Color ANCHOR_FILLCOLOR = Color.white;
	public static enum EAnchorTypes {NW, NN, NE, WW, EE, SW, SS, SE, RR, NONE}
		
	//GEMenuColor
	public static final String FILLCOLOR_TITLE = "Select Fill Color";
	public static final String LINECOLOR_TITLE = "Select Line Color";
	
	//GETransformer
	public final static int DEFAULT_DASH_OFFSET = 4;
	public final static int DEFAULT_DASHEDLINE_WIDTH = 1;
	

}
