#!/usr/bin/env groovy

def imageTag = "1.1.${env.BUILD_NUMBER}"
def propertiesFileName = "pipelineResource.yaml"

def props

pipeline{
	agent any
	
    stages { 
        stage ('Build') { 
 			echo "********************* Build ***********************"
        }
        stage ('Test') { 
        	echo "********************* Test ***********************"
        }
        stage ('QA') { 
        	echo "********************* QA ***********************"
        }
        stage ('Deploy') { 
        	echo "********************* Deploy ***********************"
        }
        stage ('Monitor') { 
 			echo "********************* Monitor ***********************"
        }
 
    } 
}