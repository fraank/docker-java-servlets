# Java Servlet Example

Servlets are Java web components used to create web applications. They respond to incoming web requests and return dynamic web pages, data, or other media. Servlets run in a Java application server such as Apache Tomcat, IBM Websphere, or Oracle WebLogic.

The advantage of using Docker for servlet development is that compiling the code and deploying it on a application server only takes a single step instead of compiling the code, packaging the application and deploying to an app server in several steps.

This example will cover building and deploying a simple servlet and web page using Docker.

## Building and running the application

This example requires Docker CE 17.06 or higher. Clone the repository and build the application.

```
docker build
```

```
docker up
```

Per default the application found in /srv/helloservlet is served. You can change that by changing the APP_NAME and APP_CLASS in the docker-compose.yml.

To visit your source go to:
```
http://localhost:8080/helloservlet/
```




## What is this code about?

A good introduction into things done here can be found on this site:
https://www.ntu.edu.sg/home/ehchua/programming/java/JavaServlets.html#helloservlet