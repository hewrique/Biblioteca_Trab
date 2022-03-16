package builder;

public class Bibliotecario extends Biblioteca{
   	int escolha;
	Editora editora= new Editora();
	Livros livros = new Livros();
        
        
        
	protected Biblioteca funcionario;
	
	public Bibliotecario (Biblioteca funcionario) {
		this.funcionario = funcionario;
		
	}
        
           @Override
        public void mostrar(){
            funcionario.getLivro();
            funcionario.getEditora();
            funcionario.getConhecimento();
        }
	
        @Override
	public void inserir() {
            funcionario.setLivro();
            funcionario.setEditora();
            funcionario.setConhecimento();
            
        }
}
            
            
         
