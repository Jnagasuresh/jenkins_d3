// When condition
// https://www.jenkins.io/doc/book/pipeline/syntax/#when
pipeline {
    agent any
    environment {
        // our own custom env variable
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('ProdDeploy'){
            when {
                environment name: 'DEPLOY_TO', value: 'other'
            }
            steps {
                echo "Deployin to production"
            }
        }
    }
}