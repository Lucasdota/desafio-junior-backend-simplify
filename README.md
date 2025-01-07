<h1 align="center">
  Desafio sistema de gerenciamento de tarefas (To-Do List)
</h1>

## Descrição
- API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

## Requisitos
- Usar banco de dados
- Campos mínimos da entidade de tarefa
    - Nome
    - Descrição
    - Realizado
    - Prioridade
- Criar CRUD de tarefas

## Instruções
- Fazer um fork do repositório para sua conta pessoal do git
- Trabalhar utilizando commits
- Documentar como executar sua aplicação
- Descrever as funcionalidades do software

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências

## Como Executar

- Clonar repositório git
- Atualizar o application.properties com suas informações
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/desafio_simplify-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

- Criar Tarefa(POST: http://localhost:8080/todo)
```
[
  {
    "description": "Example Todo Description 1",
    "id": 1,
    "name": "Example 1",
    "priority": 1,
  }
]
```

- Listar Tarefas(GET: http://localhost:8080/todo)
```
[
  {
    "description": "Example Todo Description 1",
    "id": 1,
    "name": "Example 1",
    "priority": 1,
    "done": false
  }
]
```

- Atualizar Tarefa(PUT: http://localhost:8080/todo/1)
```
[
  {
    "description": "Updating Todo Description 1",
    "id": 1,
    "name": "Example 1",
    "priority": 2,
    "done": true
  }
]
```

- Remover Tarefa(DELETE: http://localhost:8080/todo/1)
```
[ ]
```
