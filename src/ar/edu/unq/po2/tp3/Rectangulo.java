package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point esqInferiorIzq = new Point();
	private Point esqInferiorDer = new Point();
	private Point esqSuperiorIzq = new Point();
	private Point esqSuperiorDer = new Point();
	private int alto;
	private int ancho;
	
	public Point getEsqInferiorIzq() {
		return esqInferiorIzq;
	}
	public void setEsqInferiorIzq(Point esqInferiorIzq) {
		this.esqInferiorIzq = esqInferiorIzq;
	}
	public Point getEsqInferiorDer() {
		return esqInferiorDer;
	}
	public void setEsqInferiorDer(Point esqInferiorDer) {
		this.esqInferiorDer = esqInferiorDer;
	}
	public Point getEsqSuperiorIzq() {
		return esqSuperiorIzq;
	}
	public void setEsqSuperiorIzq(Point esqSuperiorIzq) {
		this.esqSuperiorIzq = esqSuperiorIzq;
	}
	public Point getEsqSuperiorDer() {
		return esqSuperiorDer;
	}
	public void setEsqSuperiorDer(Point esqSuperiorDer) {
		this.esqSuperiorDer = esqSuperiorDer;
	}
	
	public void crearRectangulo() {
		esqInferiorIzq.Punto();
		esqInferiorDer.Punto(ancho, 0);
		esqSuperiorIzq.Punto(0, alto);
		esqSuperiorDer.Punto(ancho, alto);
	}
	
	public int area() {
		return ancho * alto;
	}
	
	public int perimetro() {
		return 2 * (ancho + alto);
	}
	
	public String horizontalOVertical() {
		if(ancho > alto) {
			return "es horizontal";
		}
		else return "es vertical";
	}
}
