/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorproject;

/**
 *
 * @author gabri
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		
		LivroMenu [] LivroMenu = new LivroMenu[4];
		
		LivroMenu[0] = new LivroMenu("Menu 1");
		LivroMenu[1] = new LivroMenu("Menu 2");
		LivroMenu[2] = new LivroMenu("Menu 3");
		LivroMenu[3] = new LivroMenu("Menu 4");
		
		IteratorMenu iteratorMenu = new IteratorMenu(LivroMenu);
		
		while (iteratorMenu.hasNext()) {
			LivroMenu livroMenu = (LivroMenu)iteratorMenu.next();
			System.out.println(livroMenu.nome);
		}
		
		
	}
    
}
