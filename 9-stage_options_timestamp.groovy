pipeline {
    agent any
    options {
                timestamps()
            }
    stages {
        stage ('BuildStage') {
            steps {
                echo "Hello world!!!"
            }
        }
         stage ('Test') {
            steps {
                echo "Testing stage Executing!!!"
            }
        }
    }
}