pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    options {
        timestamps()
        disableConcurrentBuilds()
        buildDiscarder(
            logRotator(
                numToKeepStr: '10',
                artifactNumToKeepStr: '5'
            )
        )
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub...'
                checkout scm
            }
        }

        stage('Environment Check') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Build and Test') {
            steps {
                echo 'Compiling the project and running tests...'
                bat 'mvn clean test'
            }
        }

        stage('Package WAR') {
            steps {
                echo 'Creating the WAR file...'
                bat 'mvn package -DskipTests'
            }
        }

        stage('Verify WAR') {
            steps {
                script {
                    if (!fileExists('target/student-management.war')) {
                        error 'student-management.war was not generated.'
                    }

                    echo 'WAR file generated successfully.'
                }
            }
        }

        stage('Archive WAR') {
            steps {
                archiveArtifacts(
                    artifacts: 'target/student-management.war',
                    fingerprint: true
                )
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }

        failure {
            echo 'Pipeline failed. Email notification will be added after the first successful build.'
        }

        always {
            junit(
                testResults: 'target/surefire-reports/*.xml',
                allowEmptyResults: true
            )
        }
    }
}