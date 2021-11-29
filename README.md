# Explorando Padrões de Projetos na Prática com Java

## Digital Innovation One: Labs

Projeto desenvolvido com instruções de [Venilton FalvoJr](https://github.com/falvojr) no Labs da [Digital Innovation One](https://www.dio.me/). Como base foi utilizado o repositório [digitalinnovationone/lab-padroes-projeto-spring](https://github.com/digitalinnovationone/lab-padroes-projeto-spring). Neste Lab foi exposto também padrões de projeto Singleton, Strategy e Facade em Java puro que podem ser conferidos no repositório [digitalinnovationone/lab-padroes-projeto-java](https://github.com/digitalinnovationone/lab-padroes-projeto-java)

<p align="center">
	<img alt="Repository language count" src="https://img.shields.io/github/languages/count/didifive/lab-padroes-projeto-java-spring">
	<a href="https://www.linkedin.com/in/luis-carlos-zancanela/">
		<img alt="Made by Didi" src="https://img.shields.io/badge/made%20by-Didi-green">
	</a>
	<a href="https://github.com/didifive/lab-padroes-projeto-java-spring/commits/master">
		<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/didifive/lab-padroes-projeto-java-spring?color=blue">
	</a>
	<img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen?color=blue">
</p>

<p align="center">
	<a href="https://dev.java/">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java">
	</a>
</p>

<hr>

Para iniciar este projeto, foi utilizado o [spring initializr](https://start.spring.io/) utilizando as opções:
* Project: Maven Project;
* Language: Java 11;
* Spring Boot: 2.6.0;
* Dependencies: Spring Web, Spring Data JPA, H2 Database e OpenFeign.

Dependência adicionada manualmente no `pom.xml`: [Springdoc OpenAPI UI v1.5.12](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui/1.5.12).

<hr>

Padrões e conceitos apresentados no Lab:
* *Singleton*: Padrão Criacional que permite a criação de uma única instância de uma classe e fornecer um modo para recuperá-la;
* *Strategy*: Padrão Comportamental com objetivo de simplificar a variação de algoritmos para a resolução de um mesmo problema;
* *Facade*: Padrão Estrutural que visa prover uma interface que reduza a complexidade nas integrações com subsistemas.

A relação entre Padrões de Projetos com Java e o spring framework pode-se ser percebida em:
* Annotations *@Bean* e *@Autowired* como padrão criacional **Singleton**;
* Annotations *@Service* e *@Repository* como padrão comportamental **Strategy**;
* Annotation *@RestController* como padrão estrutural **Facade**.

<hr>

Swagger: ``http://127.0.0.1:8080/swagger-ui.html``

Minimun Payload in POST: 
```JSON
{
  "name": "string",
  "ean": "string",
  "unity": "string",
  "distributors": [
    {
      "name": "string",
      "comments": "string",
      "address": {
        "cep": "stringCepWith8Numbers"
      },
	  "addressNumber": 1
    }
  ]
}
```
Example:
```JSON
{
  "name": "Caneta Esferográfica",
  "ean": "0058771387587",
  "unity": "Peça",
  "distributors": [
    {
      "name": "BIC",
      "comments": "Fabricante de canetas",
      "address": {
        "cep": "06447130"
      },
      "addressNumber": 800
    }
  ]
}
```

<hr>

Links Interessantes:
* IDE: [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/);
* [jsonschema2pojo.org](https://www.jsonschema2pojo.org);
* [ViaCEP](https://viacep.com.br);
* [Entendendo os conceitos dos Padrões de Projetos em Java - Devmedia](https://www.devmedia.com.br/entendendo-os-conceitos-dos-padroes-de-projetos-em-java/29083).

