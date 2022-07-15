package com.example.demo.global.filter;

import java.time.LocalDateTime;


import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class LogFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated 
		String req =exchange.getRequest().getURI().getRawPath();
		System.out.println("One Request from"+req+"at"+LocalDateTime.now());
		return chain.filter(exchange);
	}

}
