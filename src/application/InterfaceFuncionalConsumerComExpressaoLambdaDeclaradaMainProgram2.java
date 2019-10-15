package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Produto;

/**
 * 4ª Forma usando Expressão Lambda Declarada Consumer - Programação Funcional
 * 
 * @author julian
 *
 */
public class InterfaceFuncionalConsumerComExpressaoLambdaDeclaradaMainProgram2 {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<Produto>();
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 650.00));
		list.add(new Produto("Iphone C", 300.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("HD Case", 80.90));

		Consumer<Produto> prod = p -> p.setPreco(p.getPreco() * 1.1);
		list.forEach(prod);

		list.forEach(System.out::println);
	}
}
