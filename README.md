
#Instalação JDK 17
https://adoptium.net/

#Compilar quarkus
./mvnw compile quarkus:dev

#Configurar modo debug
https://www.youtube.com/watch?v=3E0xGpC7W3I
acrescentar no arquivo louch.json o codigo abaixo
 {
            "type": "java",
            "name": "Debug (Attach)",
            "request": "attach",
            "hostName": "localhost",
            "port": 5005
    }
#Swagger
http://localhost:8080/q/swagger-ui/

#doc 
http://localhost:8080/q/dev/

docker pull postgres
docker run --network host -e POSTGRES_PASSWORD=postgres -d postgres

docker pull jboss/keycloak
docker run -d -p 8180:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin jboss/keycloak

#Video implementação keycloak
https://www.youtube.com/watch?v=Pqg88fR3nfUhttps://www.youtube.com/watch?v=Pqg88fR3nfU

#Baixando imagem do keycloak com perfil de dev
docker run --name keycloak -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin -p 8180:8080 quay.io/keycloak/keycloak:17.0.0 start-dev