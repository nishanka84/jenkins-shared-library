def call(Map config){
  
  writeFile file: "${env.WORKSPACE}/testing.yaml", text: "config.texting."
  test = sh (cat "${env.WORKSPACE}/testing.yaml",returnStdout: true).trim()
  println test
  
}
