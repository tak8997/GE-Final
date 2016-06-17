package transformer;

import java.awt.Graphics2D;
import java.awt.Point;
import shapes.GEShape;
import shapes.GEPolygon;
import java.util.ArrayList;
import constants.GEConstants;

public class GEDrawer extends GETransformer {

	public GEDrawer(GEShape shape) {
		super(shape);
	}

	@Override
	public void transformer(Graphics2D g2D, Point p) {
		g2D.setXORMode(g2D.getBackground());
		g2D.setStroke(basicStroke);
		shape.draw(g2D);
		shape.setCoordinate(p);
		shape.draw(g2D);
	}

	@Override
	public void init(Point p) {
		shape.initDraw(p);

	}
	
	public void  continueDrawing(Point p){
		((GEPolygon)shape).continueDrawings(p);
	}
	
	public void finalize(ArrayList<shapes.GEShape> shapeList){
		shapeList.add(shape);
	}

}
