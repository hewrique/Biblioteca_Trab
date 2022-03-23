package abstract_factory;

public class Cliente {

    public static void main(String[] args) {

        Gerenciamento gerente = new Gerence();

        Livro it_coisa = gerente.adicionarLivro(1);

        it_coisa.exibirInfoLivro();

    }
}
