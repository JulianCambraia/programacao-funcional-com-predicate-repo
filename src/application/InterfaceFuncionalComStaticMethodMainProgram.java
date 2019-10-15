package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.entities.Produto;

/**
 * 2ª Forma usando metodo statico com lambda - Programação
 * Funcional
 * 
 * @author julian
 *
 */
public class InterfaceFuncionalComStaticMethodMainProgram {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<Produto>();
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 650.00));
		list.add(new Produto("Iphone X", 300.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("HD Case", 80.90));

		List<String> names = list.stream().map(Produto::staticUpperCaseName).collect(Collectors.toList());

		names.forEach(System.out::println);
	}
}
