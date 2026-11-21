pipeline {
    agent any

   

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/usuario/demo-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'echo $pwd'
            }
        }

        stage('Test') {
            steps {
                sh 'echo test'
            }
        }

        stage('Package') {
            steps {
                sh 'echo package'
            }
        }
    }

    post {
        success {
            echo 'Build completado correctamente'
        }

        failure {
            echo 'Build falló'
        }

        always {
            archiveArtifacts artifacts: 'target/*.jar'
        }
    }
}
