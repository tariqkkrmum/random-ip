#!/usr/bin/env groovy

def imageTag = "1.1.${env.BUILD_NUMBER}"
def propertiesFileName = "pipelineResource.yaml"

def props
def common = load “common.groovy”

pipeline {
  agent any

  tools{
  	jdk "JDK 1.8.0_241"
  }
  stages {
    stage('Build') {
      steps {
      	script{
         	common.delete()
         }
        echo "********************* Build ***********************"
      }
    }
    stage('Test') {
      steps {
        echo "********************* Test ***********************"
      }
    }
    stage('QA') {
      steps {
        echo "********************* QA ***********************"
      }
    }
    stage('Deploy') {
      steps {
        echo "********************* Deploy ***********************"
      }
    }
    stage('Monitor') {
      steps {
        echo "********************* Monitor ***********************"
      }
    }

  }
}