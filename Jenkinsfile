pipeline {
    agent {
        node {
            label 'local'
        }
    }
    triggers {
        pollSCM('H/2 * * * *')
    }
    stages {
        stage('Run') {
            steps {
                checkout scm
                sh 'sleep 1000'
                sh 'echo bla2'
            }
        }
    }
}
