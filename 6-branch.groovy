pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                echo "Build Pipeline"
            }
        }
         stage ('Scans') {
            steps {
                echo "Scans Pipeline"
            }
        }
        stage ('DockerBuild') {
            steps {
                echo "Docker Pipeline"
            }
        }
         stage ('Devpipeline') {
            steps {
                echo "dev Pipeline"
            }
        }
    }
}