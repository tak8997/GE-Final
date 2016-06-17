package shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class GERectangle extends GEShape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GERectangle(){
		super(new Rectangle());
	}
	
	public void initDraw(Point startp){
		this.startP = startp;
	}
	
	public void setCoordinate(Point currentP){
		Rectangle tempRectangle = (Rectangle)myShape;
		tempRectangle.setFrame(startP.x, startP.y,
				currentP.x-startP.x, currentP.y-startP.y);
		if(anchorList !=null){
			anchorList.setPosition(myShape.getBounds());
		}
	}
	
	public GEShape clone(){
		return new GERectangle();
	}
	public GEShape deepCopy() {
		AffineTransform affineTransform = new AffineTransform();
		Shape newShape = affineTransform.createTransformedShape(myShape);
		GERectangle shape = new GERectangle();
		shape.setShape(newShape);
		shape.setGraphicsAttributes(this);
		return shape;
	}
}
