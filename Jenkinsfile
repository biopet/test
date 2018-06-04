pipeline {
    agent {
        node {
            label 'local'
        }
    }
    triggers {
        pollSCM('H/1 * * * *')
    }
    stages {
        stage('Run') {
            steps {
                checkout scm
                sh 'sleep 300'
                sh 'echo bla2'
            }
        }
    }
}
