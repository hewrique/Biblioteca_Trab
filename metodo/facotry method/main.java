package biblioteca;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner escolha = new Scanner(System.in);
		int novaEscolha = 3;
		Bibliotecario bibliotecario = new Bibliotecario();
		
		System.out.println("livros");
		bibliotecario.gerir(3, "livros teste");
		bibliotecario.gerir(1);
		
		System.out.println("----");
		System.out.println("Editora");
		bibliotecario.gerir(4, "teste editora");
		bibliotecario.gerir(2);
		
//		sistema de menu
		do {
			menu();
//			pega a escolha do usuario por algum metodo de input que eu nao lembro
			
	        novaEscolha = escolha.nextInt(); //pra exemplificar
			bibliotecario.gerir(novaEscolha);
			
			bibliotecario.gerir(novaEscolha, "teste");
		}while(novaEscolha != 0);
		
		
	}
	
	
	public static void menu() {
		System.out.println("--- MENU ---");
		System.out.println("1 - mostrar livros");
		System.out.println("2 - mostrar editora");
		System.out.println("3 - inserir livros");
		System.out.println("4 - inserir editora");
		System.out.println("...");
		System.out.println("0 - sair");
	}
	
}

