
def call(Map config){
    stage ('test') {
        steps {
            script {
                git branch: "${config.branch}", url: "${config.url}"     
            }
        }
    }
}
