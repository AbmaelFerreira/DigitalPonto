package com.digitalpontos.model;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class JornadaTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descricao;

}
