def call(Map config) {
      
      if(config.buildType == 'true') {
              sh 'mvn package'
      } else {
            echo config.message
      }
  
 }
return this
