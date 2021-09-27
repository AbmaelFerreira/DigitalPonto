package com.digitalpontos.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Localidade {

    @Id
    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;


}
