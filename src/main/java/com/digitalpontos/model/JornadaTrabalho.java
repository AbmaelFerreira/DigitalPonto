package com.digitalpontos.model;

import jdk.jfr.Enabled;
import lombok.*;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JornadaTrabalho {

    private long id;
    private String descricao;

}
