
def call() {
  def pipelineCfg = readFile(file: "${WORKSPACE}/config.yaml")
  println pipelineCfg
  return pipelineCfg
}
