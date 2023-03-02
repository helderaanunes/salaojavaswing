package br.com.cafi.salaodesktop.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double preco;
    private String descricao;
    private int tempo;
}
