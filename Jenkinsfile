pipeline {
  agent {
    docker {
      args '-v /root/.m2:/root/.m2'
      image 'maven:alpine'
    }
    
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
  }
}