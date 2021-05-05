def call(Map config){
 
  //git url:"${config.gitUrl}", branch: "refs/heads/${config.type}"
  dir ("${env.WORKSPACE}") {
  //  checkoutScm("${config.gitUrl}", "refs/heads/${config.branch}")
    def data = "Hello World\nSecond line\n"
    writeFile file: "testing.txt", text: data
    sh 'cat testing.txt'
             /*  sshagent(['ec2-user']) {
                sh("git add testing.txt")
                sh("git pull origin refs/heads/${config.branch}") 
                sh("git push origin HEAD:refs/heads/${config.branch}") 
            }*/

  }  
  
}
