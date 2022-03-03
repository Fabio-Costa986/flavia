package testes;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUlr) {
		metodos.abrirNavegador("https://www.google.com.br");

	}

	@When("pesquisar o nome da escola")
	public void pesquisar_o_nome_da_escola() {
		metodos.escrever("E2e treinamentos", el.getPesquisar());
		metodos.submit(el.getPesquisar());

	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
		
		metodos.fecharNavegador();

	}

}
