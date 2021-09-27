package com.digitalpontos.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

//Tudo isso também poderia ser alterado para @Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Movimentacao {



    //Tudo isso também poderia ser alterado para @Data
    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;

    @ManyToOne
    private Localidade dataEntrada;
    @ManyToOne
    private Localidade dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;

}
