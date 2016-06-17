package shapes;

import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class GEEllipse extends GEShape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GEEllipse(){
		super(new Ellipse2D.Double());
	}

	public void initDraw(Point startp){
		this.startP = startp;
	}
	
	public void setCoordinate(Point currentP){
		Ellipse2D  tempEllipse = (Ellipse2D)myShape;
		tempEllipse.setFrame(startP.x, startP.y,
				currentP.x-startP.x, currentP.y-startP.y);
		if(anchorList !=null){
			anchorList.setPosition(myShape.getBounds());
		}
		}
	
	public GEShape clone(){
		return new GEEllipse();
	}
	public GEShape deepCopy() {
		AffineTransform affineTransform = new AffineTransform();
		Shape newShape = affineTransform.createTransformedShape(myShape);
		GEEllipse shape = new GEEllipse();
		shape.setShape(newShape);
		shape.setGraphicsAttributes(this);
		return shape;
	}
}
