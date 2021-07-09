# Camel Hello World Examples

This project has a lot of examples of Apache Camel features.

## Running examples

To run the examples is necessary uncomment this line on begin of the class:

```java
//@Component
```
And run as Spring Boot application.  
Some examples has external dependencies, like:

#### Running ActiveMQ examples:
To run this ActiveMQ examples is necessary:  

* Run an ActiveMQ server: see how to in this README.md file.
* Include new dependency in pom.xml (`<artifactId>camel-activemq-starter</artifactId>`).
* Configure activemq.broker-url on application.props file (`spring.activemq.broker-url=tcp://localhost:61616`).

#### Running Kafka examples:
To run this Kafka examples is necessary:  

* Run an Kafka server: see how to in this README.md file.
* Include new dependency in pom.xml (`<artifactId>camel-kafka-starter</artifactId>`)
* Configure kafka.brokers on application.props file (`camel.component.kafka.brokers=localhost:9092`)

#### Running Rest API examples:
To run this Rest API examples is necessary:  
* Include new dependency in pom.xml (`<artifactId>camel-http-starter</artifactId>`)


#### Running Unmarshal JSON Messages
To run Unmarshal JSON is necessary:

* Include new dependency in pom.xml (`<artifactId>camel-jackson-starter</artifactId>`).

#### Running Unmarshal XML Messages
To run Unmarshal XML is necessary:

* Include new dependency in pom.xml (`<artifactId>camel-jacksonxml-starter</artifactId>`).

#### Running CSV Messages
To run CSV examples is necessary:

* Include new dependency in pom.xml (`<artifactId>camel-csv-starter</artifactId>`).

#### Running MessageHistory
To run MessageHistory in complete mode is necessary:

* Configure 'camel.springboot.message-history' on application.props file (`camel.springboot.message-history=true`)

#### Running Encrypt and Decrypt examples
To run encrypt and decrypt examplas is necessary:

* Include new dependency in pom.xml (`<artifactId>camel-crypto-starter</artifactId>`).
* Create a key store for decription: 

```
keytool -genseckey -alias myDesKey -keypass someKeyPassword -keystore myDesKey.jceks -storepass someKeystorePassword -v -storetype JCEKS -keyalg DES
```


## Running External Dependencies Server

### Run ActiveMQ Server on Docker

Running the container:

```
docker run -d -p --name activemq 61616:61616 -p 8161:8161 rmohr/activemq:latest
docker logs -f activemq
```
Acessing de web-console:

```
http://localhost:8161
user: admin
pwd:  admin
```

## Run Kafka Server on Docker

Running containers on docker-compose:

```
cd .../camel-hello-world
docker-compose up -d
docker logs -f
```

> In case of error like this: `java.net.UnknownHostException: 587a60cb3d5d`  
Its necessary config your /etc/hosts to know this value as 127.0.0.1