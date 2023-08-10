def call(){
    sh 'mvn clean'
    sh 'mvn clean install'
    sh 'mvn test'
}