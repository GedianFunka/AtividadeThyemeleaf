package com.example.Exercicio_Thymeleaf.Service;

import com.example.Exercicio_Thymeleaf.Model.UsuarioGamer;
import com.example.Exercicio_Thymeleaf.Repository.UsuarioGamerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UsuarioGamerService {

    private final UsuarioGamerRepository repository;

    public List <UsuarioGamer> listar(){
        repository.findAll();
    }

    public UsuarioGamer BuscarporId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Usuario gamer não encontrado"));
    }

    public UsuarioGamer salvar(UsuarioGamer usuarios){
        return repository.save(usuarios);
    }

    public UsuarioGamer atualizar(Long id, UsuarioGamer dados){
        UsuarioGamer usuario = BuscarporId(id);
        usuario.setNickname(dados.getNickname());
        usuario.setEmail(dados.getEmail());
        usuario.setJogoFavorito(dados.getJogoFavorito());
        usuario.setNivel(dados.getNivel());
        return repository.save(usuario);
    }

    public void excluir(Long id){
        repository.deleteAllById(id);
    }

}
