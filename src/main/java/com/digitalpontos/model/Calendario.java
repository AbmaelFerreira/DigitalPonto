
package com.digitalpontos.model;

import lombok.*;

import java.time.LocalDateTime;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Calendario {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
