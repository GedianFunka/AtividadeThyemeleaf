package com.example.Exercicio_Thymeleaf.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@GeneratedValue
@Table(name = "usuarios")

public class UsuarioGamer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nickname;
    private String email;
    private String jogoFavorito;
    private Integer nivel;
}
