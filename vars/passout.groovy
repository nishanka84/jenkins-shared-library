
def call(String name = "master"){
    stage ('test') {
        steps {
            script {
                git branch: ${name}, url: https://github.com/nishanka84/HelloTesting-World    
            }
        }
    }
}
