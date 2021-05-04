def call(Map config){
  dir ("${env.WORKSPACE}") {
  writeYaml file: testing.yaml, text: "config.texting."
  sh 'cat testing.yaml'
  }  
  
}
