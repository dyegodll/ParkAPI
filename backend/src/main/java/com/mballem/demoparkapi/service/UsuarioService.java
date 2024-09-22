package com.mballem.demoparkapi.service;

import com.mballem.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //injeção de dependências pelo lombok
@Service //transforma a classe em bin
public class UsuarioService {

    private final UsuarioRepository usuarioRepository; //o atributo deve ser final para funcionar com o lombok

}
