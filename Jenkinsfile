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
                sh 'sleep 500'
                sh 'echo bla'
            }
        }
    }
}
