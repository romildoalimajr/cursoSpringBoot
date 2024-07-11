package br.com.pizzariacursodankicode.cursospringboot.pizza;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Pizza")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Pizza {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;
    private boolean disponivel;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    @Enumerated(EnumType.STRING)
    private Sabor sabor;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
}
