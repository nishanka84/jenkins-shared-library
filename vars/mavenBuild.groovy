def call(Map config) {
      
      if(config.buildType == 'release') {
              sh 'mvn package'
      } else {
           echo config.message
      }
  
 }
return this
