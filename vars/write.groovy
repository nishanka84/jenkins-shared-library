def call(Map config){
  dir ("${env.WORKSPACE}") {
  writeFile file: "${env.WORKSPACE}/testing.txt", text: "config.texting."
//  sh 'cat testing.txt'
  }  
  
}
