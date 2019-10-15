package model.service;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Produto;

public class ProdutoService {

	public double filtrarSomando(List<Produto> list, Predicate<Produto> criterio) {
		double soma = 0.00;
		for (Produto p : list) {
			if (criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}

}
