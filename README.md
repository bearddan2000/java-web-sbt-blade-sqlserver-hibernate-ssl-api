# java-web-sbt-blade-sqlserver-hibernate-ssl-api

## Description
Creates a small database table
called `dog` a Provides end-to-end self signed ssl certs.nd populates with
hql.

## Tech stack
- java
- sbt
  - hibernate
  - hql
  - blade
  - mssql driver

## Docker stack
- alpine:edge
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10
- mcr.microsoft.com/mssql/server:2017-latest-ubuntu
- traefik:v2.4

## To run
`sudo ./install.sh -u`
[Available here](localhost)

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [HQL code based on](https://www.journaldev.com/2954/hibernate-query-language-hql-example-tutorial)
- [Hibernate config based on](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/An-example-hibernatecfgxml-for-MySQL-8-and-Hibernate-5)
- [Hibernate code based on](https://github.com/lokeshgupta1981/hibernate/tree/master/hibernate-hello-world)
