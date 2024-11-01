package br.com.plusoft.nexus.empresa;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "T_N_EMPRESA")
public class Empresa {

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa_seq")
    @SequenceGenerator(name = "empresa_seq", sequenceName = "seq_n_empresa", allocationSize = 1)
    @Column(name = "id")
    private Long id;  

    @NotBlank(message = "{empresa.razaoSocial.notblank}")
    @Size(min = 3, max = 255, message="{empresa.razaoSocial.size}")
    @Column(name = "nm_razao_social")
    private String razaoSocial;  

    @Column(name = "nm_fantasia")
    @Size(min = 3, max = 255, message="{empresa.nomeFantasia.size}")
    private String nomeFantasia;  

    @Column(name = "tp_area_atuacao")
    @NotBlank(message = "{empresa.areaDeAtuacao.notblank}")
    @Size(min = 3, max = 100, message="{empresa.areaDeAtuacao.size}")
    private String areaDeAtuacao; 

    @Column(name = "nr_cnpj")
    @NotBlank(message = "{empresa.cnpj.notblank}")
    private String cnpj; 
}
