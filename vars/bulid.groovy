#!/usr/bin/env groovy
def call(){
    pipeline{
        agent any
        tools{
            git 'Default'
            maven 'maven'
        }
        stage('bulid'){
            step{
                echo "========executing bulid========"
                sh 'mvn clean install'
            }
        }
    }
}
