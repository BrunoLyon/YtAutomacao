package testes;


import org.junit.Test;

import elementos.Elementos;
import homePage.MassaDeDados;
import metodos.Metodos;

public class MusicaTeste {
	// criar ponteiro
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados md = new MassaDeDados();



	
	@Test
	public void loginValido() {
		metodos.abrirNavegador();
		metodos.clicar(el.pesquisar);
		metodos.escrever(el.pesquisar, md.rock);
		metodos.clicar(el.lupa);
		metodos.timer();
		metodos.clicar(el.playListC);
		metodos.timer();
		metodos.clicar(el.btnPlayer);
		metodos.timer();
		metodos.limpar(el.pesquisar);
		metodos.timer();
		metodos.escrever(el.pesquisar, "esperando os 5sec do anuncio");
		metodos.evidencia("ct - musicaSelecionada");
		metodos.timer();
		metodos.timer();
		metodos.clicar(el.espandirTela);
		metodos.clicar(el.pularAnuncio);
		metodos.clicar(el.reCaptcha);
		metodos.evidencia("ct - musicaReproduzindo");
		metodos.timer();
		metodos.fecharNavegador();
		

	

	}

}
