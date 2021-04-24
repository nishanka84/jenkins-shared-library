def call(String buildType) {
      
      if(config.buildType == 'release') {
              sh 'mvn package'
//      } else {
//            echo message
      }
  
 }
return this
