package br.com.lettiere.calc.modelo;


@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor);
	
}
