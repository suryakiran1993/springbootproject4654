pipeline 
{
 agent any
 
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Deploy to Tomcat') {
      steps {
        sh '''
          TOMCAT_DIR="C:/Program Files/Apache Software Foundation/Tomcat 10.1/webapps/"
          WAR_FILE="target/SpringBootDemoProject.war"

          rm -rf $TOMCAT_DIR/SpringBootDemoProject.war
          cp $WAR_FILE $TOMCAT_DIR/
        '''
      }
    }
  }
}
