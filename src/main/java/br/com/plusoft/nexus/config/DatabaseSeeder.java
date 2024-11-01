package br.com.plusoft.nexus.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.plusoft.nexus.empresa.Empresa;
import br.com.plusoft.nexus.empresa.EmpresaRepository;
import br.com.plusoft.nexus.produto.Produto;
import br.com.plusoft.nexus.produto.ProdutoRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public void run(String... args) throws Exception {


        empresaRepository.saveAll(
                List.of(
                        Empresa.builder().razaoSocial("Supermercado ABC").nomeFantasia("ABC Supermercados").areaDeAtuacao("Varejo").cnpj("12.345.678/0001-90").build(),
                        Empresa.builder().razaoSocial("Distribuidora XYZ").nomeFantasia("XYZ Atacado").areaDeAtuacao("Atacado").cnpj("98.765.432/0001-10").build(),
                        Empresa.builder().razaoSocial("Farmácia São Paulo").nomeFantasia("Farmácias São Paulo").areaDeAtuacao("Varejo").cnpj("11.222.333/0001-11").build(),
                        Empresa.builder().razaoSocial("Loja de Roupas Moda Fina").nomeFantasia("Moda Fina").areaDeAtuacao("Varejo").cnpj("44.555.666/0001-12").build(),
                        Empresa.builder().razaoSocial("Atacado de Bebidas Lanches").nomeFantasia("Bebidas Lanches").areaDeAtuacao("Atacado").cnpj("77.888.999/0001-13").build()
                )
        );
    
        // Criar os produtos
        produtoRepository.saveAll(
                List.of(
                        Produto.builder().tipo("Refrigerante").nome("Pepsi-cola").marca("Pepsico").modelo("2L").quantidade(200).valor(8).descricao("Refrigerante Pepsi de 2 Litros").build(),
                        Produto.builder().tipo("Refrigerante").nome("Coca-Cola").marca("Coca-Cola Company").modelo("2L").quantidade(150).valor(8.5).descricao("Refrigerante Coca-Cola de 2 Litros").build(),
                        Produto.builder().tipo("Água Mineral").nome("Fonte de Vida").marca("Fonte de Vida").modelo("500ml").quantidade(300).valor(1.5).descricao("Água mineral Fonte de Vida 500ml").build(),
                        Produto.builder().tipo("Suco").nome("Suco de Laranja").marca("Tropicana").modelo("1L").quantidade(100).valor(5).descricao("Suco de Laranja Natural Tropicana 1L").build(),
                        Produto.builder().tipo("Cerveja").nome("Skol").marca("Ambev").modelo("350ml").quantidade(180).valor(3).descricao("Cerveja Skol Lata 350ml").build(),
                        Produto.builder().tipo("Snacks").nome("Doritos").marca("Pepsico").modelo("150g").quantidade(250).valor(6).descricao("Doritos sabor Queijo 150g").build(),
                        Produto.builder().tipo("Chocolate").nome("Lacta ao Leite").marca("Lacta").modelo("90g").quantidade(120).valor(4).descricao("Chocolate ao leite Lacta 90g").build(),
                        Produto.builder().tipo("Detergente").nome("Minuano").marca("Minuano").modelo("500ml").quantidade(200).valor(2.5).descricao("Detergente Minuano 500ml").build(),
                        Produto.builder().tipo("Sabão em Pó").nome("Omo").marca("Unilever").modelo("1kg").quantidade(160).valor(10).descricao("Sabão em Pó Omo 1kg").build(),
                        Produto.builder().tipo("Frutas").nome("Banana").marca("Frutas Frescas").modelo("1kg").quantidade(300).valor(3).descricao("Bananas frescas por kg").build()
                )
        );

    }

}
