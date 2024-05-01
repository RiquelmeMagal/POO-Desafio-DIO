package Model;

import Interfaces.ModoNavegacao;
import Interfaces.ModoReprodutorMusical;
import Interfaces.ModoTelefonico;

public class Celular implements ModoReprodutorMusical, ModoTelefonico, ModoNavegacao{
	
	private String nome;
	private String id;
	
	public Celular() {
		
	}
	
	public Celular(String nome, String id) {
		this.nome = nome;
		this.id = id;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void exibirPagina() {
		System.out.println("Celular está exibindo uma página.");
		
	}

	@Override
	public void adicionarNovaPagina() {
		System.out.println("Adicionou uma nova página");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizou a página");
		
	}

	@Override
	public void ligar() {
		System.out.println("Está ligando");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Está iniciando o correio de voz");
		
	}

	@Override
	public void tocar() {
		System.out.println("Está tocando");
		
	}

	@Override
	public void atender() {
		System.out.println("Está atendendo.");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");
		
	}


}
