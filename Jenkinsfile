pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/di-yong/saucedemo.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                echo 'Installing dependencies...'
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.html', allowEmptyArchive: true
            junit 'target/surefire-reports/*.xml'
        }
    }
}