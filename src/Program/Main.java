package Program;

import Model.Celular;

public class Main {

	public static void main(String[] args) {
		Celular iphone = new Celular("Iphone", "123");
		
		iphone.adicionarNovaPagina();
		iphone.atender();
		iphone.atualizarPagina();
		iphone.exibirPagina();
		iphone.iniciarCorreioDeVoz();
		iphone.ligar();
		iphone.tocar();

	}

}
