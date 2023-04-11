package br.com.cotiinformatica.api.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    //Lendo o valor do parametro queue.name criado no properties
    @Value("${queue.name}")
    private String queueName;

    //Configuracao para o projeto conectar na fila criada do servidor do RabbitMQ
    @Bean
    public Queue queue() {
        return new Queue(queueName, true);
    }
}
