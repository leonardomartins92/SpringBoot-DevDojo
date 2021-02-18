#Configurar Banco de dados

##Adicionar dependências:

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>

##Adicionar configurar resources/application.yml

server:
  error:
    include-stacktrace: on_param

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/anime?useSSL=false&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true
    username: root
    password: root
  jpa:
    hibernate:
      ddl-auto: update
## Configurar as classes que serão Entidades:

@Entity
public class Anime{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
}
