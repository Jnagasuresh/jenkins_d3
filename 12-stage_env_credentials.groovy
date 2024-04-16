pipeline {
    agent any
    stages {
        stage ('Build') {
            environment {
               GITHUB_CREDS = credentials('nags_creds') // Username and password
            }
            steps {
                echo "My Github credentials are ${GITHUB_CREDS}"
                echo "My UserName is:  ${GITHUB_CREDS_USR}"
                echo "My Password is:  ${GITHUB_CREDS_PSW}
            }
        }
    }
}