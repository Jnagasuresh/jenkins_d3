pipeline {
    agent {
        label 'java-slave'
    }
    tools {
        maven 'Maven-3.8.8'
    }
    stages {
        stage ("Maven") {
            steps {
                echo 'Hello, welcome to tools section'
                sh 'mvn --version'
            }
        }
        stage ('cartmaven'){
            // this tools section will take presedenc
            tools {
                jdk 'JDK-17'
            }
            steps {
                echo 'Hello, welcome to CartMaven section'
                sh 'mvn --version'
            }
        }
    }
    
}