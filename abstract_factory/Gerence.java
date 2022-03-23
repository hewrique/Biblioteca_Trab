package abstract_factory;

public class Gerence implements Gerenciamento{

    @Override
    public Livro adicionarLivro(int tipo) {
        Livro genero = null;
        switch (tipo){
            case 1:
                genero = new Terror();
                break;

            case 2:
                genero = new Fantasia();
                break;

            case 3:
                genero = new Romance();
                break;

            case 4:
                genero = new Fic_Cientifc();
                break;
        }
        System.out.println("Livro Adicionado");
        return genero;
    }

    @Override
    public void excluirLivro() {
        System.out.println("Livro Excluido");
    }

    @Override
    public void alugarLivro() {
        System.out.println("Livro Alugado");
    }

    @Override
    public void receberLivro() {
        System.out.println("Livro Recebido");
    }
}
