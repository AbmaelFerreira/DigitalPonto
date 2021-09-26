package com.digitalpontos.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movimentacao {



    //Tudo isso também poderia ser alterado para @Data
    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private Localidade dataEntrada;
    private Localidade dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;

}
