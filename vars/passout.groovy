
def call(){
    stage ('test') {
        steps {
            script {
                git branch: "master", url: "https://github.com/devops4solutions/CI-CD-using-Docker.git"     
            }
        }
    }
}
