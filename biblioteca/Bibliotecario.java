package biblioteca;

public class Bibliotecario {
	int escolha;
	Editora editora;
	Livros livros;
	
	Bibliotecario() {
		this.escolha = 1;
		this.editora = new Editora();
		this.livros = new Livros();
	}
	
	// polimorfismo
	// vai entrar aqui se for apenas para mostrar
	void gerir(int escolha) {
		if(escolha == 1) {
			this.livros.mostrar();
		}
		if(escolha == 2) {
			this.editora.mostrar();
		}
	}
	
	
	//vai entrar aqui se for inserir algum item
	void gerir(int escolha, String adicao) {
		if(escolha == 3) {
			this.livros.inserir(adicao);
		}
		if(escolha == 4) {
			this.editora.inserir(adicao);
		}
	}
}
