pipeline{
    stages {
        stage ('Scans'){
            steps {
                echo "Scan Pipeline"
            }
        }
        stage ('dockerbuild'){
            steps {
                echo "Docker Pipeline"
            }
        }
        stage ('devdeploy')
        {
            steps {
                echo "dev Pipeline"
            }
        }
        stage ('DeploytoTest')
        {
            steps {
                echo "Test Pipeline"
            }
        }
         stage ('DeploytoStage')
        {
            steps {
                echo "Stage Pipeline"
            }
        }
         stage ('DeploytoProd')
        {
            steps {
                echo "Prod Pipeline"
            }
        }
    }
}