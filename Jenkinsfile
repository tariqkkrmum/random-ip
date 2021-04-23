#!/usr/bin/env groovy

def imageTag = "1.1.${env.BUILD_NUMBER}"
def propertiesFileName = "pipelineResource.yaml"

def props
def common = load “common.groovy”

pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
         common.delete();
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

def initProperties(filename){
    props = readProperties file: filename
    println 'Properties passed in are ' + props
}