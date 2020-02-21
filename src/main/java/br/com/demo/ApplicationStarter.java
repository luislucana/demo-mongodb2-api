package br.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.mongodb.com/blog/post/rest-apis-with-java-spring-boot-and-mongodb
 * https://docs.mongodb.com/manual/tutorial/convert-standalone-to-replica-set/
 * https://github.com/simplicityitself/Mongo-Tomcat-Sessions
 * https://docs.spring.io/spring-boot/docs/2.0.8.RELEASE/reference/htmlsingle/#boot-features-connecting-to-mongodb
 * https://docs.spring.io/spring-data/mongodb/docs/2.2.4.RELEASE/reference/html/#reference
 * https://www.mongodb.com/blog/post/mongodb-multi-document-acid-transactions-general-availability
 * https://medium.com/oril/uploading-files-to-aws-s3-bucket-using-spring-boot-483fcb6f8646
 * https://github.com/joshlong/bookmarks/tree/tutorial
 * https://blog.marcosbarbero.com/pt_BR/multiple-mongodb-connectors-in-spring-boot/
 * https://github.com/weekly-drafts/spring-boot-multi-mongo
 * https://community.apigee.com/questions/66284/authentication-and-authorization-with-spring-boot.html
 * https://developer.okta.com/docs/guides/build-self-signed-jwt/java/overview/
 * https://www.baeldung.com/spring-security-5-oauth2-login
 * https://www.devglan.com/spring-boot/spring-boot-mongodb-crud
 * https://www.devglan.com/spring-security/spring-webflux-rest-authentication
 * https://github.com/sogilis/spring-boot-jpa-mongodb-example
 */
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}