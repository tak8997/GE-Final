package frames;

import constants.GEConstants;
public class GELauncher {

	public static void main(String[] args) {
		GEMainFrame frame = new GEMainFrame(GEConstants.TITLE_MAINFRAME);
		frame.init();
	}

}
