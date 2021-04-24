def call(String buildType, string message) {
      
      if(config.buildType == 'release') {
              sh 'mvn package'
      } else {
            echo message
      }
  
 }
return this
