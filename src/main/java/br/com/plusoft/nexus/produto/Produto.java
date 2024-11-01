package br.com.plusoft.nexus.produto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_N_PRODUTO")
public class Produto {

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq", sequenceName = "seq_n_produto", allocationSize = 1)
    @Column(name = "id")
    private Long id;  

    @Column(name = "tp_produto")
    @NotBlank(message = "{produto.tipo.notblank}")
    @Size(max = 255, message="{produto.tipo.size}")
    private String tipo;  

    @Column(name = "nm_produto")
    @NotBlank(message = "{produto.nome.notblank}")
    @Size(max = 255, message="{produto.nome.size}")
    private String nome; 

    @Column(name = "nm_marca")
    @NotBlank(message = "{produto.marca.notblank}")
    @Size(max = 255, message="{produto.marca.size}")
    private String marca;  

    @Column(name = "nm_modelo")
    @NotBlank(message = "{produto.modelo.notblank}")
    @Size(max = 255, message="{produto.modelo.size}")
    private String modelo; 

    @Column(name = "nr_quantidade")
    @NotNull(message = "{produto.quantidade.notnull}")
    @PositiveOrZero(message="{produto.quantidade.positiveorzero}")
    private int quantidade; 

    @Column(name = "vl_produto")
    @NotNull(message = "{produto.valor.notnull}")
    @Positive(message="{produto.valor.positive}")
    private double valor; 

    @Column(name = "ds_produto")
    @NotBlank(message = "{produto.descricao.notblank}")
    @Size(max = 255, message="{produto.descricao.size}")
    private String descricao; 
}
