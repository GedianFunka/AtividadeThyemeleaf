package com.example.Exercicio_Thymeleaf.Repository;

import com.example.Exercicio_Thymeleaf.Model.UsuarioGamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioGamerRepository extends JpaRepository <UsuarioGamer, Long> {
}
