package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.GEConstants.EEditMenuItems;
import frames.GEDrawingPanel;
import shapes.GEGroup;
import shapes.GEShape;

public class GEMenuEdit extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GEDrawingPanel drawingPanel;
	private EditMenuHandler editMenuHandler;
	private ArrayList<GEShape> copyList;
	public GEMenuEdit(String s) {
		super(s);
		editMenuHandler = new EditMenuHandler();
		for(EEditMenuItems btn : EEditMenuItems.values()){
			JMenuItem menuItem = new JMenuItem(btn.toString());
			menuItem.addActionListener(editMenuHandler);
			menuItem.setActionCommand(btn.toString());
			this.add(menuItem);
		}
		copyList = new ArrayList<GEShape>();
	}

	public void init(GEDrawingPanel dp){
		drawingPanel = dp;
	}
	private void group() {
		drawingPanel.group(new GEGroup());
	}
	private void ungroup() {
		drawingPanel.unGroup();
	}

	private class EditMenuHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (EEditMenuItems.valueOf(e.getActionCommand())) {
			case Undo:			break;
			case Redo:			break;
			case 삭제: delete(); break;
			case 잘라내기: cut(); break;
			case 복사: copy(); break;
			case 붙이기: paste(); break;
			case 그룹 : group(); break;
			case 그룹해제: ungroup(); break;

			}
		}

		private void paste() {
			drawingPanel.paste(copyList);
		}

		private void copy() {
			copyList.clear();
			copyList.addAll(drawingPanel.copy());
		}

		private void cut() {
			copyList.clear();
			copyList.addAll(drawingPanel.cut());
		}

		private void delete() {
			drawingPanel.delete();
		}

		
	}
	
}
