# Curso de Spring Boot API REST: construa uma API 

## Tópicos Abordados:
- Criando aplicações Java com o Spring Boot
- Configurando aplicação Spring sem o uso de arquivos XML.
- Desenvolvimento web com ajuda do Spring Devtools
- Estilo arquitetural REST
- Utilizando o Spring Data e Bean Validation
- Paginação e ordenação dos resultados da API
- Melhorando desempenho com Spring Cache
- Protegendo a API com Spring Security e JWT
- Monitorando os endpoints com Spring Boot Actuator e Admin com o projeto disponível na branch (https://github.com/SarahTumenas/alura-spring-boot-api-rest-forum/tree/spring-boot-admin)
- Documentação da API com Swagger
- Atualização da versão do Spring Boot da API
- Proteção de endpoints baseados em perfil de usuário
- Separação de configurações em Profiles
- Testes automatizados de componentes do Spring Boot
- Simulação de deploy da API localmente:
    - para gerar o jar da aplicação no windows: ./mvnw clean install(na primeira vez) ou ./mvnw clean package(se já tiver o jar)
    - para acessar o jar na pasta target criada:  cd target/
    - para executar o jar:  java -jar forum-0.0.1-SNAPSHOT.jar
    - para alterar o nome do pacote  jar, no pom após build < finalName > forum </ finalName>
    - para o profile de prod: passando as informações do banco no terminal (
  export FORUM_DATABASE_URL=jdbc:h2:mem:alura-forum
  export FORUM_DATABASE_USERNAME=sa 
  export FORUM_DATABASE_PASSWORD=  
  export FORUM_JWT_SECRET=123456); depois java -jar -Dspring.profiles.active=prod forum.jar
- Utilização do Docker na API
- Deploy da API no Heroku

## Tecnologias Utilizadas:
- Banco de dados H2 com Spring Boot
- Java 8
- Maven
- Spring Web
- Spring Data JPA
- Postman
- Spring Cache
- Spring Security
- Spring Boot Actuator
- SpringFox Swagger
- Spring profiles
- Testes automatizados com Spring Boot
- Docker
- Heroku
