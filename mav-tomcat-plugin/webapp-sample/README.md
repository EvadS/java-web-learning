# learnjava-webapp-example

Demonstrates Tomcat Maven Plugin. Refer [Tomcat Maven Plugin with code sample](https://learnjava.co.in/tomcat-maven-plugin-with-code-sample/) for a detailed tuorial.

Build the code
```
    mvn clean install
```


Run the following command to start the embedded Tomcat container
```
mvn tomcat7:run
```


To check start page 
```
http://localhost:8080/
```

http://localhost:8080/webapp_sample_war/     <-- index.jsp
прибавляем url-pattern + непосредственно апи 

## ТОМКАТ ЧЕРЕЗ ИДЕЙКУ
```
    http://localhost:8080/webapp_sample_war/api/message
    http://localhost:8080/webapp_sample_war/api/users
    
    http://localhost:8080/webapp_sample_war/api/hello
 ```

http://localhost:9998/webapp_sample_war/api/hello

## tomcat plugin 
http://localhost:8080/api/message/hello



Замечания 
во втором можно использовать аннотации
```
@ApplicationPath("api")
public class RestApplication extends Application {

}
```