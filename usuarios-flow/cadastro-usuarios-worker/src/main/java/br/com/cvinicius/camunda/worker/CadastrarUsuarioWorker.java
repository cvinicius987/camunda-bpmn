package br.com.cvinicius.camunda.worker;

import org.camunda.bpm.client.ExternalTaskClient;

import br.com.cvinicius.camunda.ExternalClient;

public class CadastrarUsuarioWorker {
			
	public void start() {
		
		ExternalTaskClient client = ExternalClient.getClient();
		
		client.subscribe("salvar-usuario-banco")
				.lockDuration(1000) 
				.handler((externalTask, externalTaskService) -> {
				
					String username = (String) externalTask.getVariable("username");
					String email    = (String) externalTask.getVariable("email");
					
					System.out.println(" =========== Cadastro de Usuarios =========== ");
					System.out.println(" Nome: "+username);
					System.out.println(" Email: "+email);
					System.out.println(" ============================================ ");
		
					externalTaskService.complete(externalTask);
				})
				.open();
	}
}