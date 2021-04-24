def call(String buildType) {
      
      if(buildType == 'true') {
              sh 'mvn package'
//      } else {
//            echo "${message}
      }
  
 }
return this
