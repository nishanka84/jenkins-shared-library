/*def call(String filename) {
try{
    dir ("${WORKSPACE}") {
      def exists = fileExists filename
      if (exists) {
        println "Config file [${workspace}/" + filename + "] found"
        def file = readFile(file: 'config.yaml')
        return file
      } else {
          println "Config file [${workspace}/" + filename + "] not found"
          throw new Exception("Config file [${workspace}/" + filename + "] not found")
      }
    }
  } catch (err) {
      throw err
  }
}*/

def call() {
  Map pipelineCfg = readFile(file: "${WORKSPACE}/config.yaml")
  return pipelineCfg
}
