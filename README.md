<div align="center">
    <h2>⚜️ N E X U S - DevOps ⚜️</h2>
</div>

<p align="center">
    <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#-funcionalidades">Funcionalidades</a>
</p>

<h3>Integrantes</h3>

- [Matheus O.A.C Silva](https://github.com/mathabes) - RM 98502
- [Amorgan M. Lopes](https://github.com/GanLopes) - RM 98552
- [Guilherme C. de Matos](https://github.com/guicarm) - RM 98874
- [Gustavo G. da Silva](https://github.com/GuGodoi7) - RM 99585
- [Erick K. da Silva](https://github.com/ErickKS) - RM 550371

<br/>

--------------------------------------------------

<br/>

## 📚 Projeto 

<p>Bem-vindo ao Nexus. O projeto consiste no desenvolvimento de um Chatbot funcional que utiliza o WhatsApp como plataforma principal. Esse Chatbot será capaz de se integrar a diversos sistemas externos, como APIs de inteligência artificial, e-commerce, e sistemas de recomendações. Isso permitirá oferecer um atendimento personalizado e eficaz aos seus clientes.</p>
<p>O público-alvo do projeto Nexus são Produtos que buscam soluções inovadoras para melhorar o atendimento ao cliente, aumentando assim, sua satisfação e consequentemente otimizando suas operações comerciais.</p>

<br/>

## 🖥 Tecnologias

- [Spring](https://spring.io)
- [Insomnia](https://insomnia.rest/download)

<br/>

## 🧾 Funcionalidades

- [x] CRUD de Produtos.
- [x] CRUD de Produtos.

<br/>

## Como Rodar a Aplicação

API disponível em -> https://nexus-marketplace-java.azurewebsites.net

<br/>

## Documentação da API

### Endpoints 

- [Listar Produtos](#listar-Produtos)
- [Cadastrar Produtos](#cadastrar-Produtos)
- [Detalhar Produtos](#detalhar-Produtos)
- [Excluir Produtos](#excluir-Produtos)
- [Atualizar Produtos](#atualizar-Produtos)
  
<br>

- [Listar Empresas](#listar-Empresas)
- [Cadastrar Empresas](#cadastrar-Empresas)
- [Detalhar Empresas](#detalhar-Empresas)
- [Excluir Empresas](#excluir-Empresas)
- [Atualizar Empresas](#atualizar-Empresas)

<br>

### Listar Produtos

`GET` /Produto

Retorna um array com todos os produtos registrados.

#### Exemplo de Resposta

```js
[
    {
    "id": 1,
    "tipo": "bebida",
    "nome": "Coca-Cola Zero 2L",
    "marca": "Coca-Cola",
    "modelo": "Zero",
    "quantidade": 1,
    "valor": 12.99,
    "descricao": "Uma bebida extremamente refrescante"
  }
]
```
<br>


### Cadastrar Produtos

`POST` /Produto

Cadastra um produto especificado através de seu ID.

#### Exemplo de Requisição
```js
// POST /Produto
{
    "tipo": "bebida",
    "nome": "Coca-Cola Zero 2L",
    "marca": "Coca-Cola",
    "modelo": "Zero",
    "quantidade": 1,
    "valor": 12.99,
    "descricao": "Uma bebida extremamente refrescante"
  }
```

#### Exemplo de Resposta
```js
{
    "id": 2
    "tipo": "bebida",
    "nome": "Coca-Cola Zero 2L",
    "marca": "Coca-Cola",
    "modelo": "Zero",
    "quantidade": 1,
    "valor": 12.99,
    "descricao": "Uma bebida extremamente refrescante"
  }
```
<br>


### Detalhar Produtos

`GET` /Produto/`{id}`

Detalha um produto especificado através de seu ID.

#### Exemplo de Resposta
```js
// GET /Produto/1
{
    "id": 1,
    "tipo": "bebida",
    "nome": "Coca-Cola Zero 2L",
    "marca": "Coca-Cola",
    "modelo": "Zero",
    "quantidade": 1,
    "valor": 12.99,
    "descricao": "Uma bebida extremamente refrescante"
  }
```
<br>


### Excluir Produtos

`DELETE` /Produto/`{id}`

Exclui um produto especificado através de seu ID.

<br>

### Atualizar Produtos

`PUT` /Produto/`{id}`

Atualiza um produto especificado através de seu ID.

#### Exemplo de Requisição
```js
// PUT /Produto/1
{
    "tipo": "bebida",
    "nome": "Coca-Cola 2L",
    "marca": "Coca-Cola",
    "modelo": "Original",
    "quantidade": 1,
    "valor": 12.99,
    "descricao": "Uma bebida gelada para os dias de calor"
  }
```

#### Exemplo de Resposta
```js
{
    "id": 1,
    "tipo": "bebida",
    "nome": "Coca-Cola 2L",
    "marca": "Coca-Cola",
    "modelo": "Original",
    "quantidade": 1,
    "valor": 12.99,
    "descricao": "Uma bebida gelada para os dias de calor"
  }
```
<br>

### Listar Empresas

`GET` /Empresa

Retorna um array com todas as empresas registradas.

#### Exemplo de Resposta

```js
[
    {
    "id": 1,
    "razaoSocial": "Grupo Nexus",
    "nomeFantasia": "Nexus",
    "areaDeAtuacao": "tecnologia especializada em chatbots",
    "cnpj": "20.031.219/0002-46"
  }
]
```
<br>


### Cadastrar Empresas

`POST` /Empresa

Cadastra uma empresa especificada através de seu ID.
#### Exemplo de Requisição
```js
// POST /Empresa
{
    "razaoSocial": "Grupo Nexus",
    "nomeFantasia": "Nexus",
    "areaDeAtuacao": "tecnologia especializada em chatbots",
    "cnpj": "20.031.219/0002-46"
  }
```

#### Exemplo de Resposta
```js
{
    "id": 1,
    "razaoSocial": "Grupo Nexus",
    "nomeFantasia": "Nexus",
    "areaDeAtuacao": "tecnologia especializada em chatbots",
    "cnpj": "20.031.219/0002-46"
  }
```
<br>


### Detalhar Empresas

`GET` /Empresa/`{id}`

Detalha uma empresa especificada através de seu ID.

#### Exemplo de Resposta
```js
// GET /Empresa/1
{
    "id": 1,
    "razaoSocial": "Grupo Nexus",
    "nomeFantasia": "Nexus",
    "areaDeAtuacao": "tecnologia especializada em chatbots",
    "cnpj": "20.031.219/0002-46"
  }
```
<br>


### Excluir Empresas

`DELETE` /Empresa/`{id}`

Exclui uma empresa especificada através de seu ID.

<br>

### Atualizar Empresas

`PUT` /Empresa/`{id}`

Atualiza uma empresa especificada através de seu ID.

#### Exemplo de Requisição
```js
// PUT /Empresa/1
{
    "razaoSocial": "Grupo Nexus",
    "nomeFantasia": "Nexus",
    "areaDeAtuacao": "chatbots",
    "cnpj": "20.031.219/0002-46"
  }
```

#### Exemplo de Resposta
```js
{
    "id": 1,
    "razaoSocial": "Grupo Nexus",
    "nomeFantasia": "Nexus",
    "areaDeAtuacao": "chatbots",
    "cnpj": "20.031.219/0002-46"
  }
```
