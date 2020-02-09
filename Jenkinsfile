#!/usr/bin/env groovy

node {
    // Jenkins job should have environment name appended to it for this file to work.
    def buildVersion
    def latestBuildVersion

    // Find previous build number
    def previousBuildVersion
    build = currentBuild
    while (build != null && build.result != 'SUCCESS') {
        build = build.previousBuild
    }
    if (build != null) {
        previousBuildVersion = build.id
    }

    if ("${JOB_NAME}".toLowerCase().contains("dev")) {
        buildVersion = "dev.${BUILD_NUMBER}"
        latestBuildVersion = "dev.latest"
        previousBuildVersion = "dev.${previousBuildVersion}"
    } else {
        buildVersion = "${BUILD_NUMBER}"
        latestBuildVersion = "latest"
        previousBuildVersion = "${previousBuildVersion}"
    }

    echo "Previous successful build version: ${previousBuildVersion}"

    stage('checkout') {
        checkout scm
    }

    stage('check java') {
        sh "java -version"
    }

    stage('clean') {
        sh "chmod +x mvnw"
        sh "./mvnw clean"
    }

    stage('packaging') {
        sh "./mvnw package verify -DskipTests=true"
    }

    def dockerImage
    stage('build docker') {
        sh "./mvnw jib:dockerBuild -f registry/pom.xml"
        sh "./mvnw jib:dockerBuild -f gateway/pom.xml"
        sh "./mvnw jib:dockerBuild -f service/pom.xml"
    }

    stage('publish docker') {
        sh "echo 'bigboss7' | docker login -u sonirahul --password-stdin"
        sh "docker tag registry sonirahul/registry";
        sh "docker push sonirahul/registry";
        sh "docker tag gateway sonirahul/gateway";
        sh "docker push sonirahul/gateway";
        sh "docker tag service sonirahul/service";
        sh "docker push sonirahul/service";
    }

}
