# spring-boot-practice

[![Build Status](https://img.shields.io/travis/ksoichiro/spring-boot-practice/master.svg?style=flat-square)](https://travis-ci.org/ksoichiro/spring-boot-practice)

This is a project to show 'how-to' for Spring Boot application development.  

To check each topics, see each sub-directories' README.

## Contents

1. [Hello world](contents/20150622-hello-world)
1. [Connecting to database](contents/20150622-db)
1. Join tables
    1. [Join using ManyToMany annotation](contents/20150829-join-manytomany)
    1. [Join using OneToMany annotation](contents/20150829-join-manytomany2)
    1. [Join using JPQL with association table](contents/20150829-join-manytomany3)
    1. [Join using JPA Specification](contents/20150901-join-manytomany4)
    1. [Join using Querydsl](contents/20150903-join-manytomany5)
    1. [Join using Querydsl with pagination](contents/20150903-join-manytomany6)
    1. [Join using Querydsl with soft delete](contents/20150903-join-manytomany7)
    1. [Join using JPA Criteria API with soft delete](contents/20150908-join-manytomany8)
1. [Helper Bean for Thymeleaf](contents/20150910-thymeleaf-helper)
1. [Testing with JDBC/JPA](contents/20150911-test-jdbc)
1. [Testing with MySQL](contents/20151109-test-mysql)
1. [Managing properties with multibyte and convert to ascii on build](contents/20151208-properties)
1. [Adding Git commit SHA to profile](contents/20151210-git-sha-to-profile)
1. [Handling web resource](contents/20160221-web-resource)
1. [Testing Controllers using MockMvc](contents/20160307-test-controllers)
1. [Adding fixed version to JavaScript/CSS libraries](contents/20160321-fixed-version)
1. [Using Javassist to conditionally make Entity's field persistent](contents/20160405-javassist)
1. [Modifying class definition using Javassist](contents/20160405-javassist)
1. [Query validation for Repositories](contents/20160720-query-validation)
1. [Using native functions with Querydsl](contents/20160821-querydsl-join)
1. [Running small apps using Spring Boot CLI](contents/20160924-cli-script)
1. [Testing controllers faster](contents/20160927-mock-controller-tests)
1. [Using subquery in native SQL join clause with Querydsl](contents/20161011-querydsl-native-sql-join)
1. [Result set mapping for native queries](contents/20161012-native-query)
1. [Logging controller method execution using AOP](contents/20161016-logging)

## Notice

* This project uses Gradle and developed with IntelliJ IDEA.
* This project uses Java 8 lambda expression.
    * Please set Gradle JVM to Java 8 to build properly.
* This project uses [Lombok](https://projectlombok.org/) to generate getters/setters.
    * Please set Annotation Processor function enabled (Preferences > Build, Execution, Deployment > Compiler > Enable annotation processing).

## License

    Copyright 2015 Soichiro Kashima

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
