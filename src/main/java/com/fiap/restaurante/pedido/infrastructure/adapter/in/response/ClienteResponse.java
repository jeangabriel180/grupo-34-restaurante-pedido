package com.fiap.restaurante.pedido.infrastructure.adapter.in.response;


import com.fiap.restaurante.pedido.core.domain.Cliente;

public record ClienteResponse(Long idCliente, String cpf, String nome, String email, String telefone) {

    public static ClienteResponse fromDomain(Cliente cliente) {
        return new ClienteResponse(cliente.getIdCliente(), cliente.getCpf(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
    }
}