package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;
import model.service.ProdutoService;

/**
 * Função que recebe outra Função usando Expressão Lambda - Programação
 * Funcional
 * 
 * @author julian
 *
 */
public class FuncaoQueRecebeFuncaoMainProgram {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<Produto>();
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 650.00));
		list.add(new Produto("Iphone X", 300.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("HD Case", 80.90));

		ProdutoService ps = new ProdutoService();

		double total = ps.filtrarSomando(list, p -> p.getNome().charAt(0) == 'M');

		System.out.println("Total: " + total);
	}
}
