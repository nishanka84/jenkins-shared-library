def call(Map config){
  dir ("${env.WORKSPACE}") {
  writeFile file: testing.txt, text: "config.texting."
  sh 'cat testing.txt'
  }  
  
}
