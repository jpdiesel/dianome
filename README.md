# Projeto: Dianome

## Descrição

O projeto "Dianome" trata-se de uma API responsável por lidar com funcionários da empresa Dianome,
uma empresa fictícia responsável pela execução do sistema de envio e entrega de correspondências. Esta
API administra os entregadores juntamente com a capacidade de carga de seu veículo de transporte, então
ela fornece três principais informações: o nome e o cpf do entregador, e a capacidade de carga do véiculo.

## Requisitos para funcionamento do projeto

- GIT
- JDK - 21.0
- Spring Boot 3.2.0
- Postaman ou algum aplicativo para requisição HTTP (recomendável) 

## Clonando o projeto para sua máquina local

Para realizar a clonagem do projeto do repositório para sua máquina, clique no botão verde escrito **CODE**

![Imagem do botão verde a ser clicado](https://i.imgur.com/mUaPxNH.png)

Após isso, você poderá escolher entre a URL em HTTP, SSH ou GitHub CLI para realizar a clonagem. Neste exemplo, irei usar o SSH.

![Botões da URL](https://i.imgur.com/GBJmlU9.png)

Acesse a sua pasta de preferência para salvar o projeto através do terminal e após isso execute o comando:

```
git clone git@github.com:jpdiesel/dianome2.0.git
```

Após o término da clonagem, abra o projeto na sua IDE de preferência. Usando o VS Code como exemplo, pode-se utilizar o comando `code .` para abrir o projeto no VS Code pelo terminal.

## Variáveis de ambiente para o funcionamento do banco de dados MYSQL

Em `src/main/resources` há o arquivo `application.properties`, em que devem ser adicionadas as seguintes variáveis de ambiente fazer a conexão do banco de dados através do Spring Boot Starter JPA:

```
spring.datasource.url={MINHA-URL-MYSQL}
spring.datasource.name={MEU-USUÁRIO-MYSQL}
spring.datasource.password={MINHA-SENHA-MYSQL}
```

PS: os códigos entre `{}` são apenas exemplos, ao adicionar o projeto em sua máquina local, é necessário substituir pelos seus respectivos dados.

## Iniciando o projeto

Para iniciar o projeto, basta clicar no botão de executar, na sua IDE. Utilizando o VS Code como exemplo, basta clicar no botão de iniciar no plugin do Spring Boot Dashboard

![Botão de iniciar projeto VS Code](https://i.imgur.com/VdTrP6M.png)

## Endpoints

Por ser uma API RESTFUL, há endpoints para os quatro principais métodos: GET, DELETE, PUT e POST. 

### GET

Utilizando o método GET, a API retornará os funcionários registrados no banco de dados. Há dois endpoints para o método GET: `http://localhost:8080/empregados` 
e `http://localhost:8080/empregados/{id}`, sendo que o primeiro irá retornar todos os empregados e o segundo apenas o empregado do id registrado. 
O retorno será no formato JSON, seguindo a seguinte estrutura:

```
{
    "id": 6
    "nome": "Tyler",
    "cpf": "11122233300",
    "capacidade": 300
}
```

### DELETE 

Utilizando o método DELETE, a API excluirá um funcionário através de seu id registrado no banco de dados. Há apenas um endpoint para o método DELETE: 
`http://localhost:8080/empregado/deletar/{id}` e retornará apenas um boolean: `true` para caso o funcionário tenha sido excluido com sucesso e `false` caso o funcionário
não exista.

### PUT 

Utilizando o método PUT, será possível realizar a edição de um funcionário registrado no banco de dados. Há apenas um endpoint para o método PUT: 
`http://localhost:8080/empregado/editar/{id}`, que necessita de um envio através do corpo da requisição da seguinte forma: 

```
{
    "nome": "Tyler",
    "cpf": "11122233300",
    "capacidade": 350
}
```


Os dados serão retornados da seguinte maneira: 

```
{
    "id": 6
    "nome": "Tyler",
    "cpf": "11122233300",
    "capacidade": 350
}
```

### POST 

Utilizando o método POST, será possível inserir um novo funcionário no banco de dados. Há apenas um endpoint para o método POST: 
`http://localhost:8080/empregado/adicionar`, que necessita de um envio através do corpo da requisição, seguindo a estrutura JSON: 

```
{
    "nome": "Brian",
    "cpf": "01234321333",
    "capacidade": 250
}
```

O retorno será o funcionário adicionado, apresentando a seguinte estrutura:

```
{
    "id": 10
    "nome": "Brian",
    "cpf": "01234321333",
    "capacidade": 250
}
```


