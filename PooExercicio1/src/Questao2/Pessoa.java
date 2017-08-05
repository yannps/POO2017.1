package Questao2;


public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private char sexo;
	
	
	public Pessoa(String nome,int idade,double altura,double peso,char sexo){
		nome = this.nome;
		idade = this.idade;
		altura = this.altura;
		peso = this.peso;
		sexo = this.sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public double calculaImc(){
		double imc = getPeso() / (getAltura()*2);
		return imc;
		}
	
	@Override
	public String toString(){
		if(calculaImc() <= 18.5){
			return "IMC" + calculaImc() + " = Abaixo do peso normal";
		}
		else if(calculaImc() <= 25){
			return "IMC" + calculaImc() + " = Peso normal";
		}
		else if(25 < calculaImc() && calculaImc() <=30){
			return "IMC" + calculaImc() + " = Acima do peso normal";
		}
		else if(calculaImc() > 30){
			return "IMC" + calculaImc() + " = Obesidade";
		}
		return null;
	}
}
