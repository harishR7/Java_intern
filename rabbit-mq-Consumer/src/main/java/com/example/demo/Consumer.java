package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.direct.config.DirectExchangeConfig;

@Component
public class Consumer {

	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
	public void consumerMessage(String message) {
		
		System.out.println("Recevied One Message"+message);
		
	}
	
	@RabbitListener(queues ="krt.cse.student")

	public void consumeMessageFanOut (String message)
	{
		System.out.println("Received One Message:= " +message);
	}
	
	@RabbitListener(queues ="krt.ece.student")

	public void consumeMessageFanOut1 (String message)
	{
		System.out.println("Received One Message:= " +message);
	}
 

}
	

