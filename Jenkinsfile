pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        // Run Maven build using Windows batch
        bat 'mvn clean package'
      }
    }

    stage('Deploy to Tomcat') {
      steps {
        bat '''
          set "TOMCAT_DIR=C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps"
          set "WAR_FILE=target\\SpringBootDemoProject.war"

          echo Deleting existing app...
          rmdir /S /Q "%TOMCAT_DIR%\\SpringBootDemoProject.war"

          echo Copying WAR file to Tomcat...
          copy "%WAR_FILE%" "%TOMCAT_DIR%\\SpringBootDemoProject.war"
        '''
      }
    }
  }
}
