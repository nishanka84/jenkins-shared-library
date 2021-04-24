
def call(String name = "master"){
    stage ('test') {
            script {
                git branch: "${name}", url: "https://github.com/nishanka84/HelloTesting-World.git"
            }
    }
}
