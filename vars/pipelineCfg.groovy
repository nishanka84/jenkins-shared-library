
Map call() {
  Map pipelineCfg = readFile(file: "${WORKSPACE}/config.yaml")
  println pipelineCfg
  return pipelineCfg
}
