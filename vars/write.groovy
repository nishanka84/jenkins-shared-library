def writing(Map config){
  
  def data = [:]
  
  data.name = config.name
  data.role = config.role
  data.position = config.position
  
  writeFile file: "${WORKSPACE}/testing.yaml", data: data
  
}
