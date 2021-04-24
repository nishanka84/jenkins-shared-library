def call(Map config) {
      
      if(config.buildType == 'release') {
              sh 'mvn package'
//      } else {
//            echo message
      }
  
 }
return this
