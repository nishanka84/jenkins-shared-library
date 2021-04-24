
def call(Map config){
    stage ('test') {
        steps {
            script {
                git branch: "${config.test}", url: "${config.pest}"     
            }
        }
    }
}
