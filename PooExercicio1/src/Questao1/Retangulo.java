package Questao1;


public class Retangulo {

	private double largura;
	private double altura;
	private double perimetro;
	private double area;
	
	public Retangulo(double largura, double altura){
		largura =  this.largura;
		altura =  this.altura;
	}
	
	public Retangulo(){
		this.largura = 0; 
		this.altura = 0;		
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaPerimetro(){
		perimetro =  2*getLargura() + 2*getAltura();
		return perimetro;
	}
	
	public double calculaArea(){
		area = getLargura() * getAltura();
		return area;
	}
	
	@Override
	public String toString(){
	 return "Perimetro: " + calculaPerimetro() + "\nÁrea: " + calculaArea();
	

	}
}
