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
public class BancoHoras {
    private long id;
    private Movimentacao movimentacao;
    private Usuario usuario;

    private CategoriaUsuario categoriaUsuario;
    private LocalDateTime dataTrabalhada;
    private LocalDateTime horasTrabalhada;
    private LocalDateTime saidaHorasTrabalhada;

}
