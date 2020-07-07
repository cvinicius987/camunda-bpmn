package br.com.cvinicius.camunda.worker;

import org.camunda.bpm.client.ExternalTaskClient;

import br.com.cvinicius.camunda.ExternalClient;

public class EnvioMailWorker {
	
	public void start() {
		
		System.out.println("================== Aqui ");
		
		ExternalTaskClient client = ExternalClient.getClient();
		
		client.subscribe("enviar-email")
				.lockDuration(1000) 
				.handler((externalTask, externalTaskService) -> {
					
					String username = (String) externalTask.getVariable("username");
					String email    = (String) externalTask.getVariable("email");
					
					System.out.println(" =========== Enviando Email para "+email+" =========== ");
					System.out.println(" Bem-vindo "+username+" ao novo sistema de fluxos.");
					System.out.println(" ============================================ ");
		
					externalTaskService.complete(externalTask);
				})
				.open();
	}
}