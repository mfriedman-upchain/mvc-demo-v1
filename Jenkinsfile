#!/usr/local/env groovy

node() {

    stage('git') {
        git 'https://github.com/mfriedman-upchain/mvc-demo-v1.git'
    }

    stage('compile') {
        sh('./mvnw clean compile')
    }
}