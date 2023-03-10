


## generate
```bash
mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-webapp \
                -DarchetypeGroupId=org.glassfish.jersey.archetypes \
                -DinteractiveMode=false \
                -DgroupId=com.example  \
                -DartifactId=simple-service-webapp \
                -Dpackage=com.example \
                -DarchetypeVersion=2.39
```

## generated api 
```bash
  http://localhost:8080/simple_service_webapp_war/api/myresource
```

Root
```
    http://localhost:8080/simple_service_webapp_war/
```