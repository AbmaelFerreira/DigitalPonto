package com.digitalpontos.model;


import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidade {

    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;


}
