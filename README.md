Mateus Felipe Brunetti dos Santos, RA: 22012698-2

Vitor Galetti Martins, RA: 22019959-2

# Gerenciador de Funcionários - API Spring Boot

Este projeto é uma API REST desenvolvida com **Spring Boot**, **Spring JPA** e **H2 Database**, permitindo gerenciar uma lista de funcionários.

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring JPA
- H2 Database
- Postman (para testes)

## Como Executar o Projeto
1. **Baixar o código-fonte**
2. **Importar o projeto em uma IDE (IntelliJ, Eclipse, VS Code)**
3. **Executar a aplicação**:
   ```sh
   mvn spring-boot:run
   ```
3.1. **Ou executar o código diretamente na IDE**

4. **A API será iniciada em** `http://localhost:8080/`

---

## Testando a API no Postman

### 1. Adicionar um Funcionário
**Método:** `POST`
- **URL:** `http://localhost:8080/funcionarios`
- **Body (JSON, raw):**
  ```json
  {
    "id": 1
    "nome": "João Silva",
    "salario": 3000.00
  }
  ```

### 2. Listar Todos os Funcionários
**Método:** `GET`
- **URL:** `http://localhost:8080/funcionarios`

### 3. Buscar Funcionário por ID
**Método:** `GET`
- **URL:** `http://localhost:8080/funcionarios/{id}`
- **Exemplo:** `http://localhost:8080/funcionarios/1`

### 4. Atualizar o Salário de um Funcionário
**Método:** `PUT`
- **URL:** `http://localhost:8080/funcionarios/{id}?=salario atualizado`
- **Exemplo:** `http://localhost:8080/funcionarios/1?=3500.00`

### 5. Remover um Funcionário
**Método:** `DELETE`
- **URL:** `http://localhost:8080/funcionarios/{id}`
- **Exemplo:** `http://localhost:8080/funcionarios/1`

---

## Banco de Dados (H2 Database)
- O banco de dados H2 roda em **memória** e pode ser acessado pela interface web.
- Para acessar o console H2:
  - **URL:** `http://localhost:8080/h2-console`
  - **JDBC URL:** `jdbc:h2:mem:testdb`
  - **Usuário:** `sa`
  - **Senha:** *(deixe em branco)*

---

## Considerações Finais

Este projeto tem como objetivo demonstrar a implementação de um CRUD simples utilizando Spring Boot e um banco de dados em memória (H2). O Postman pode ser utilizado para testar os endpoints facilmente.

Caso tenha dúvidas, verifique os logs do console ou o banco H2 para entender melhor o funcionamento da API.

