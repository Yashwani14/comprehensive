pipeline{
    agent any 
 
    stages{
        stage('Checkout version control and Build Maven'){
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/polu99/comprehensive.git']]])
                bat 'mvn clean install'
            }
        }
        stage('create jar file after Build is success'){
            steps{
                script{
                    archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
                }
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t polu99/comprehensive .'
                }
            }
        }
         stage('Push image to Hub'){
            steps{
                script{
                   
                   bat 'docker login -u polu99 -p 8861347877'

                   bat 'docker push polu99comprehensive '
                }
            }
        }
    }
}
