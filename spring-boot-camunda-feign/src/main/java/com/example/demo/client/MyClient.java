package com.example.demo.client;

import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyClient {

    private RuntimeService runtimeService;
    
    private RepositoryService repositoryService;

    public MyClient(@Qualifier("remote") RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public void start() {
    	
        this.runtimeService.startProcessInstanceByKey("cadastrar-usuario");        
        
    }
  
}