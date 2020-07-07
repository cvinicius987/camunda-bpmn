package br.com.cvinicius.camunda;

import br.com.cvinicius.camunda.worker.CadastrarUsuarioWorker;

public class Main {

	public static void main(String[] args) {
		
		new CadastrarUsuarioWorker().start();
	}
}