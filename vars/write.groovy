def call(Map config){
  
  writeFile file: "${env.WORKSPACE}/testing.yaml", text: "config.texting."
  sh "cat "${env.WORKSPACE}/testing.yaml" "
  
}
