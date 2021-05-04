def call(Map config){
  dir ("${env.WORKSPACE}") {
  writeFile file: testing.yaml, text: "config.texting."
  sh 'cat testing.yaml'
  }  
  
}
