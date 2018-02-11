#!/bin/sh

echo "starting compiling source for $APP_NAME"
cd /usr/local/tomcat/webapps/$APP_NAME/WEB-INF
javac -classpath .:/usr/local/tomcat/lib/servlet-api.jar -d classes src/$APP_CLASS/*
echo "finished compiling of $APP_NAME"

# Hand off to the CMD
exec "$@"
