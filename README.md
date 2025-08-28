# Events API

API de gerenciamento de eventos desenvolvida com base no projeto do NLW (Next Level Week) da Rocketseat.

## 🚀 Sobre o Projeto

Este é um projeto Spring Boot que serve como backend para uma aplicação de gerenciamento de eventos. Ele fornece uma API RESTful para criar, listar e gerenciar eventos e participantes.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias:

-   **Java 21**: Versão da linguagem de programação utilizada.
-   **Spring Boot 3.4.2**: Framework para criação de aplicações Java de forma rápida.
-   **Spring Data JPA**: Para persistência de dados em um banco relacional.
-   **Maven**: Gerenciador de dependências e build do projeto.
-   **MySQL**: Banco de dados relacional utilizado para armazenar os dados.

## 📋 Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
*   [JDK 21](https://www.oracle.com/java/technologies/downloads/#jdk21-windows) ou superior.
*   [Maven](https://maven.apache.org/download.cgi) (Opcional, pois o projeto inclui o Maven Wrapper).
*   Um banco de dados [MySQL](https://dev.mysql.com/downloads/mysql/) rodando em sua máquina.

## ⚙️ Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Justi-Camila/NLW-Java.git
    cd events
    ```

2.  **Configure o banco de dados:**
    Abra o arquivo `src/main/resources/application.properties` e ajuste as configurações para o seu ambiente MySQL. Ele deve se parecer com o exemplo abaixo, que já reflete a estrutura do seu projeto:

    ```properties
    # Configurações do Banco de Dados MySQL
    spring.datasource.url=jdbc:mysql://localhost:3306/db_events
    spring.datasource.username=root
    spring.datasource.password=sua_senha_secreta

    # Configurações do Hibernate (JPA)
    # 'update': atualiza o schema do banco de dados ao iniciar a aplicação.
    # Ótimo para desenvolvimento, mas use com cuidado em produção.
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```
    > **⚠️ Segurança:** É uma boa prática não colocar senhas diretamente no código. Considere o uso de variáveis de ambiente para informações sensíveis.

3.  **Execute a aplicação:**
    Abra um terminal na raiz do projeto e execute o seguinte comando:
    ```bash
    # Usando o Maven Wrapper (recomendado)
    ./mvnw spring-boot:run
    ```

A aplicação estará disponível em `http://localhost:8080`.
