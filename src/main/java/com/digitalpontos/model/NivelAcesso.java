package com.digitalpontos.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class NivelAcesso {

    @Id
    private long id;
    private String descricao;
}
