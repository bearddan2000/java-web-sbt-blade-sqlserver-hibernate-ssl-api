FROM alpine:edge AS base

WORKDIR /cert

RUN apk upgrade --update-cache --available && \
    apk add openssl && \
    rm -rf /var/cache/apk/*

RUN openssl req -new -text -passout pass:abcd -subj /CN=localhost -out server.req -keyout privkey.pem

RUN openssl rsa -in privkey.pem -passin pass:abcd -out server.key

RUN openssl req -x509 -in server.req -text -key server.key -out server.crt

RUN chmod -R +x * && ls

FROM mcr.microsoft.com/mssql/server:2017-latest-ubuntu

ENV MSSQL_SA_PASSWORD z!oBx1ab

ENV ACCEPT_EULA Y

WORKDIR /workspace

COPY conf /var/opt/mssql

COPY --from=base /cert/server.crt /etc/ssl/certs

COPY --from=base /cert/server.key /etc/ssl/private