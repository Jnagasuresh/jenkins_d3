pipeline {
    agent any
    environment {
        course = "Docker and k8s"
        name = "Nags"
    }
    stages {
        stage ('Build') {
            environment {
                cloud = "GCP"
            }
            steps {
                echo "Welcome ${name}"
                echo "You enrolled for ${course} course"
                echo "you are certified in ${cloud} Cloud"
            }
        }
    }
}