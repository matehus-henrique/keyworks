


# keyworks
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto


Back-and com GET,POS e PUT.  implementada com base no nível de 2 de maturidade de 
Richardson




# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Implantação em produção
- Back end: workspace-spring-tool
- Banco de dados: MySql
- Banco de teste: http://localhost:8081/h2-console

# Como executar o projeto
DesafioKeyParaDesenvolvedorApplication
![image](https://user-images.githubusercontent.com/53536966/169374210-6bf2db05-cbab-409a-a738-2508923521d0.png)

Clica no Botão Runs As, em seguida no Spring Boot App

![image](https://user-images.githubusercontent.com/53536966/169374923-bd9d8445-b8ee-44cd-a161-89aa1b06d16d.png)


No Postman Para acessar http://localhost:8081/
![image](https://user-images.githubusercontent.com/53536966/169380783-927c5744-036a-4963-8238-b817a6e30135.png)


##GET
http://localhost:8081/cards
![image](https://user-images.githubusercontent.com/53536966/169417328-143a52f1-d535-4e9c-bec2-a6844b2a7fc5.png)

##GET cards/page
http://localhost:8081/cards/page

![image](https://user-images.githubusercontent.com/53536966/169417436-047254fd-2d28-4647-850c-bd399fa609b2.png)


##POST
http://localhost:8081/cards
Json
{
    "id" : null,
    "nome" : "predro",
     "projeto": "js",
     "descricao": "projeto de js",
     "status" : "atrasado",
     "data" : "null"
}
![image](https://user-images.githubusercontent.com/53536966/169419380-530e20ec-261e-4ada-8035-0dbcb7e3a435.png)


##PUT
http://localhost:8081/cards/5

Json{
    "id" : null,
    "nome" : "predro henrique",
     "projeto": "java",
     "descricao": "projeto de java",
     "status" : "atrasado",
     "data" : "null"
}
![image](https://user-images.githubusercontent.com/53536966/169424037-1ebf6349-8e15-4657-9f63-aecf0ec888e2.png)





## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/matehus-henrique/keyworks

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```



```bash
# clonar repositório
git clone (https://github.com/matehus-henrique/keyworks)



# Autor

Matheus Henrique de Aguair Freire

https://www.linkedin.com/in/matheus-henrique-4a9b23180/

