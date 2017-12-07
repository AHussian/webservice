pipeline {
    agent { docker 'maven:alpine' }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
