package builder;

public abstract class Biblioteca{
	
	protected Livros livro = new Livros();
	
	protected Editora editora = new Editora();
	
	protected Conhecimento conhecimento = new Conhecimento();
	
    public void mostrar(){
        System.out.println(this.livro+", "+this.editora+", "+this.conhecimento);
    }
    
    public abstract void inserir();
    
    public Livros getLivro(){
    	return livro;
    };
    
    public Editora getEditora() {
    	return editora;
    };
    
    public Conhecimento getConhecimento() {
    	return conhecimento;
    };

    void setLivro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEditora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setConhecimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
