package com.senac.br.social.controller;

import com.senac.br.social.entity.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping("cadastro_usuario")
    public String usuario() {
        return "cadastrar_usuario";
    }

    @PostMapping("/salvar")
    public String salvarUsuario(@RequestParam String nome,
                                @RequestParam String email,
                                @RequestParam String senha,
                                @RequestParam String perfil){

        Usuario usuario = new Usuario(nome, email , senha, perfil);

        logger.info(usuario.toString());
        return "cadastrar_usuario";
    }

}
