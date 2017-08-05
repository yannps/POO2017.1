package Questao2;


public class TestaPessoa {

	public static void main(String[] args){
		Pessoa p1 = new Pessoa("João", 22, 1.50, 30, 'M');
		p1.calculaImc();
		System.out.println(p1.toString());
	}
}
