package biblioteca;

import java.util.ArrayList;

public abstract class Biblioteca {
	ArrayList<String> lista;
	
	Biblioteca() {
		this.lista = new ArrayList<String>();
	}
	

	void mostrar() {
		for(String item : this.lista) {
			System.out.println(item);
		}
	}
	void inserir(String novaEditora) {
		this.lista.add(novaEditora);
		
	}
}
