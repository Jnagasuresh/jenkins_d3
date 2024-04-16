pipeline{
    agent any
    stages {
        stage ('Build'){
            options {
                retry(3)
            }
            steps{
                echo "Before setting current build to failure"
                script {
                    currentBuild.result = 'FAILURE'
                }
                echo "after setting current build to failure"
            }
        }
    }
}