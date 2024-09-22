package com.mballem.demoparkapi.web.controller;

import com.mballem.demoparkapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor //injeção de dependências via método construtor
@RestController //bin controller
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService; //final é complemento do método de @RequiredArgsConstructor
}
