package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void Punto() {
		this.setX(0);
		this.setY(0);
	}
	
	public void Punto(int x1, int y1) {
		this.setX(x1);
		this.setY(y1);
	}
	
	public void moverPunto(int newX, int newY) {
		this.setX(newX);
		this.setY(newY);
	}
	
	public Point sumarPuntos(Point punto1, Point punto2) {
		Point nuevoPunto = new Point();
		nuevoPunto.setX(punto1.getX() + punto2.getX());
		nuevoPunto.setY(punto1.getY() + punto2.getY());
		return nuevoPunto;
	}
}
