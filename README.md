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

![Imagem do botão verde a ser clicado](https://prnt.sc/-VbpDR3feF0w)

Após isso, você poderá escolher entre a URL em HTTP, SSH ou GitHub CLI para realizar a clonagem. Neste exemplo, irei usar o SSH.

![Botões da URL](https://prnt.sc/DpwiRxDNc1ka)

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

![Botão de iniciar projeto VS Code](https://prnt.sc/25NDuo6_TV7M)
