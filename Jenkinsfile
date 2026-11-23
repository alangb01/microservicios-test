pipeline {
    agent any

    environment {
        IMAGE_NAME = "mi-laravel-app"
        IMAGE_TAG = "${BUILD_NUMBER}"
    }

    parameters {
        string(
            name: 'BRANCH',
            defaultValue: 'main',
            description: 'Rama a desplegar'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: params.BRANCH,
                    credentialsId: '6612df2f-a302-4247-852d-e4f65757e35f',
                    url: 'https://github.com/alangb01/microservicios-test.git'
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
