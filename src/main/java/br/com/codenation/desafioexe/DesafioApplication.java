package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> integerList = new ArrayList<Integer>();
		int count = 0;
		int maximo = 0;
		do {
			if (count == 0) {
				integerList.add(count);
			} else if (count == 1) {
				integerList.add(count);
			} else {
				integerList.add(integerList.get(count - 2) + integerList.get(count - 1));
			}
			maximo = integerList.get(count);
			count++;
		} while (maximo <= 350);
		return integerList;
	}

	public static Boolean isFibonacci(Integer a) {
		List<Integer> integerList = fibonacci();
		boolean resultado = integerList.contains(a);
		return resultado;
	}

}