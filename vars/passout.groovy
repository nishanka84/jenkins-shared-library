
def call(String name = 'test'){
    stage ('test') {
            script {
                git branch: "${name}", url: "https://github.com/nishanka84/HelloTesting-World.git"
            }
    }
}
