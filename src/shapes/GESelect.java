package shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class GESelect extends GEShape {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GESelect() {
		super(new Rectangle());
	}

	@Override
	public void initDraw(Point startP) {
		this.startP = startP;
	}

	@Override
	public void setCoordinate(Point currentP) {
		Rectangle tempRectangle = (Rectangle)myShape;
		tempRectangle.setFrameFromDiagonal(startP.x,startP.y,currentP.x,currentP.y);
	}

	@Override
	public GEShape clone() {
		return new GESelect();
	}

	public GEShape deepCopy(){
		return null;
	}
}
