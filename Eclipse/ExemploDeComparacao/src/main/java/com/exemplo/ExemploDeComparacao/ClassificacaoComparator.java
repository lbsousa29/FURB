package com.exemplo.ExemploDeComparacao;

import java.util.Comparator;

public class ClassificacaoComparator implements Comparator<Time> {
	public int compare (Time t1, Time t2) {
		if (t1. getPontos() > t2.getPontos()) {
		return 1;
		}
		if (t1.getPontos() < t2. getPontos()) {
		return -1;
		}
		if (t1. getPontos() > t2.getPontos()) {
		return 1;
		}
		if (t1.getPontos() < t2. getPontos()) {
		return -1;
		}
			
		
		return 0;
		}
}
