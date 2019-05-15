package com.senac.br.social.controller;

import com.senac.br.social.entity.Usuario;
import com.senac.br.social.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("/index");

        Usuario usuario = new Usuario ("Alysson", "aly@.com", "alysson123", "ADMIN");
        usuarioRepository.save(usuario);
        return mv;
    }
}
