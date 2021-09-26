package com.digitalpontos.model;


import lombok.*;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoData {
    private long id;
    private String descricao;

}
