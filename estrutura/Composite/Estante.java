package Composite;

import java.util.ArrayList;

public class Estante extends OrganizadorEstante {
ArrayList<String> lista;
	
	Estante() {
		this.lista = new ArrayList<String>();
	}
	

	void mostrar() {
		for(String item : this.lista) {
			System.out.println(item);
		}
	}
	void inserir(String novaEditora) {
		this.lista.add(novaEditora);
        this.setEscolha(1);
        this.livros = new Livro();
	}
	
private String nome;
private String genero;
private Integer Id;
private int preço;
private int escolha;
Livro livros;
private Object editora;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public int getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}
	public int getEscolha() {
		return escolha;
	}


	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	
	
	void gerir(int escolha, String adicao) {
		if(escolha == 1) {
			this.livros.inserir(adicao);
		}
		if(escolha == 1) {
			((Livro) this.editora).inserir(adicao);
	
	

	
		}
	}

}

