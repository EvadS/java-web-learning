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
if
<port>9090</port>  presented in plugin settings 
to check webapp-sample
---------------


To check start page 
```
http://localhost:8080/
```

TEST API
```
    http://localhost:8080/webapp-sample/api/myresource
```


если убрать application context в настройках дебага

http://localhost:8080/webapp_sample_war/     <-- index.jsp
прибавляем url-pattern + непосредственно апи 

## ТОМКАТ ЧЕРЕЗ ИДЕЙКУ
```
    http://localhost:8080/webapp_sample_war/api/message
```

## tomcat plugin 
http://localhost:8080/api/message/hello
