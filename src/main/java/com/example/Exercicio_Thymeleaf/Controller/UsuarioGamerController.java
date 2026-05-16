package com.example.Exercicio_Thymeleaf.Controller;

import com.example.Exercicio_Thymeleaf.Model.UsuarioGamer;
import com.example.Exercicio_Thymeleaf.Service.UsuarioGamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/usuarios")

public class UsuarioGamerController {

    private final UsuarioGamerService service;

    @GetMapping("/")
    public String listar(Model model){
        model.addAttribute("usuarios", service.listar());
        return "lista";
    }

    @GetMapping ("/novo")
    public String novo(Model model){
        model.addAttribute("usuario", new UsuarioGamer());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute UsuarioGamer usuario){
        service.salvar(usuario);
        return "redirect:/usuarios/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model){
        UsuarioGamer usuario  = service.BuscarporId(id);
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id){
        service.excluir(id);
        return "redirect:/usuarios/";
    }
}