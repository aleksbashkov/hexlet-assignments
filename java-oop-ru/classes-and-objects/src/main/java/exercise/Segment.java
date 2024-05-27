package exercise;

// BEGIN
public class Segment {

	private Point beginPoint;
	private Point endPoint;

	public Segment(Point beginPoint, Point endPoint) {
		this.beginPoint = beginPoint;// new Point(beginPoint.getX(), beginPoint.getY());
		this.endPoint = endPoint;//new Point(endPoint.getX(), endPoint.getY());
	}

	public Point getBeginPoint() {
		return beginPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public Point getMidPoint() {
		return new Point((beginPoint.getX() + endPoint.getX()) / 2, (beginPoint.getY() + endPoint.getY()) / 2);
	}
}
// END
