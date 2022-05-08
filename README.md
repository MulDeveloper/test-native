# test-native

Simple test using spring boot native

mvn clean spring-boot:build-image

docker container run -d --name test-sb-native -p 8082:8080 test-native:0.0.1-SNAPSHOT
