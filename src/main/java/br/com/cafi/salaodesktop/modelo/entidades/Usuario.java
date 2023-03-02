package br.com.cafi.salaodesktop.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String login;
    private String senha;

}
