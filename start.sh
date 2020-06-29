#!/bin/bash

# verifica se diretorio das libs springframework e caso não exista efetua o download das libs
if [ ! -d "./lib" ]; then

    if ! [ -x "$(command -v unzip)" ]; then
        echo "Necessário instalar o unzip (sudo apt-get install zip unzip). Prosseguir (S/N)?"
        read resposta
        if [ $resposta = 'S' ] || [ $resposta = 's' ]; then
            sudo apt-get update && sudo apt-get install zip unzip
        else
         exit 1
        fi
    fi   

    mkdir .working

    wget -O .working/spring-5.zip https://repo.spring.io/release/org/springframework/spring/5.2.6.RELEASE/spring-5.2.6.RELEASE-dist.zip

    unzip -qq ./.working/spring-5.zip -d ./.working

    mkdir lib

    mv ./.working/spring-framework-5.2.6.RELEASE/libs/*.jar ./lib/

    rm -rf ./.working
fi

# Efetua a leitura de todas as libs usadas e adiciona no arquivo classpath
find ./lib -name *.jar -printf './lib/%f:' > .classpath.txt
echo './src/main/resources/:./target/classes/' >> .classpath.txt

# Lista todos os arquivos .java e guarda os caminhos dele em um arquivo
find ./src/main/java -name "*.java" > ./sources.txt

# Apaga diretório de classes antigo
rm -rf ./target

# Compila os arquivos java
javac -cp @.classpath.txt -d ./target/classes/ @sources.txt

# Apaga os arquivos auxiliares
rm sources.txt

# Selecione apenas um para executar por vez
# java -cp @.classpath.txt com.demo.SpringHelloApp
java -cp @.classpath.txt com.demo.BeanScopeDemoApp