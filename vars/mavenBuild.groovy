def call(String buildType) {
      
      if(buildType == 'release') {
              sh 'mvn package'
//      } else {
//            echo message
      }
  
 }
return this
