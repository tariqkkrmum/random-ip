def imageTag = "1.1.${env.BUILD_NUMBER}"
def propertiesFileName = "pipelineResource.yaml"

def props

pipeline{
	agent any
	
	tools{
		jdk "JDK 1.8.0_241"
	}
	
	stages{
		stage('Initialize Pipeline'){
			steps{
				properties([
					pipelineTriggers([[$class: "GitHubPushTrigger"]])
				])
				
				echo "The application param is set to ${params.applicationName}"
			}
		}
		
		stage('Build Project'){
			steps{
				script{
					gradle.configureGradle("Gradle 6.8.3")
					gradle.build()
				}
			}
		}
	}
}