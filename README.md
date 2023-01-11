# spring-boot-3.0-security-social-login

## Issue

javax.servlet.http.HttpServletRequest ClassNotFoundException

It seems this package(spring-social-facebook/2.0.3.RELEASE) is no longer actively maintained and being archived,

## Purpose

Adding a new Facebook login to an existing form-login app.

We will use the Spring Social support to interact with Facebook and keep things clean and simple.

It leverages facebook OAuth2 to login.

## Software version

Java 17

spring boot  3.0.1

spring security 6

thymeleaf-extras-springsecurity6

jakarta.persistence-api

## Folder structure

![Folder structure](https://github.com/chuangtc/spring-boot-3.0-security-social-login/blob/master/img/folder-structure.png?raw=true)


## Maven Configuration
```bash
<dependency>
    <groupId>org.springframework.social</groupId>
    <artifactId>spring-social-facebook</artifactId>
    <version>${spring.social.facebook.version}</version>
</dependency>
```

## The Facebook Properties
Next, let's configure Facebook properties in our application.properties:
```bash
spring.social.facebook.appId=YOUR_APP_ID
spring.social.facebook.appSecret=YOUR_APP_SECRET
```

## Conclusion
In this quick article, we learned how to use spring-social-facebook to implement a secondary authentication flow for our application.

## Relevant Articles:
* https://chuangtc.com/Java/spring-boot-30-security-social-login.php

## Reference
* https://chuangtc.com/Java/spring-boot-27-security-social-login.php
* https://www.baeldung.com/facebook-authentication-with-spring-security-and-social