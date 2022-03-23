package abstract_factory;

public interface Gerenciamento {

    Livro adicionarLivro(int tipo);
    void excluirLivro();
    void alugarLivro();
    void receberLivro();
}
