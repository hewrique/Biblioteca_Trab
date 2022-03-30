/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorproject;

import java.util.Iterator;

/**
 *
 * @author gabri
 */
public class IteratorMenu implements Iterator {
	
	LivroMenu[] itens;
	int posicao = 0;
	
	public IteratorMenu(LivroMenu[] itens) {
		this.itens = itens;
		
	}
	
	public Object next() {
		LivroMenu livroMenu = itens[posicao];
		posicao++;
		return livroMenu;
	}
	
	public boolean hasNext() {
		if(posicao >= itens.length || itens[posicao] == null) {
			return false;
			
		} else {
			return true;
		}
	}
}
