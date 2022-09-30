
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