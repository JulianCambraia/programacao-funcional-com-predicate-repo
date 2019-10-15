package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;

/**
 * 1ª Forma usando - Programação Funcional
 * 
 * @author julian
 *
 */
public class ProdutoPredicateExpressaoLambdaDeclaradaMainProgram {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<Produto>();
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 650.00));
		list.add(new Produto("Iphone C", 300.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("HD Case", 80.90));

		double min = 100.00;
		list.removeIf(p -> p.getPreco() >= min);

		list.forEach(System.out::println);
	}
}
