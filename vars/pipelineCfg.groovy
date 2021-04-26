
def call() {
  def pipelineCfg = readFile(file: "${WORKSPACE}/config.yaml")
  return pipelineCfg
}
