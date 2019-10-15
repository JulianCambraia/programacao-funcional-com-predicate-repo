package util;

import java.util.function.Predicate;

import model.entities.Produto;

public class ProdutoPredicate implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		return p.getPreco() >= 100.00;
	}

}
