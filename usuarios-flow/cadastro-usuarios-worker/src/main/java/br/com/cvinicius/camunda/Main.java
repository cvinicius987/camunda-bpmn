package br.com.cvinicius.camunda;

import br.com.cvinicius.camunda.worker.CadastrarUsuarioWorker;
import br.com.cvinicius.camunda.worker.EnvioMailWorker;

public class Main {

	public static void main(String[] args) {
		
		new CadastrarUsuarioWorker().start();
		new EnvioMailWorker().start();
	}

}
