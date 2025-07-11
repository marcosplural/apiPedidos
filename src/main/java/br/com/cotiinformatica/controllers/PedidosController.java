package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/pedidos")
@Tag (name = "Controle de pediods" , description = "Serviços para gerenciamento de solicitações de pedidos.")
public class PedidosController {
	
	@Operation (summary = "Cadastro de solicitações de pedido.", description = "Cria uma nova solitação de pedido no sistema.")
	@PostMapping
	public ResponseEntity<?> post() {
		//TODO cadastro do pedido
		return ResponseEntity.ok().build();
	}
	
	@Operation (summary = "Atualização de pedido.", description = "Atualiza uma solitação de pedido no sistema.")
	@PutMapping
	public ResponseEntity<?> put() {
		//TODO atualizacao do pedido
		return ResponseEntity.ok().build();
	}
	
	@Operation (summary = "Inativação de solicitações de pedido.", description = "Inativa uma solitação de pedido no sistema.")
	@DeleteExchange
	public ResponseEntity<?> delete() {
		//TODO exclusao do pedido
		return ResponseEntity.ok().build();
	}
	
	@Operation (summary = "Consulta de solicitações de pedido.", description = "Retorna uma solitação de pedido no sistema.")
	@GetMapping
	public ResponseEntity<?> get() {
		//TODO consulta do pedido
		return ResponseEntity.ok().build();
	}
	
	

}
