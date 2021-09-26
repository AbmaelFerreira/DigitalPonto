package com.digitalpontos.model;

import lombok.*;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NivelAcesso {

    private long id;
    private String descricao;
}
