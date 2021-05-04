def call(Map config){
 // git url:"${config.gitUrl}", branch: "refs/heads/${config.type}"
  dir ("${env.WORKSPACE}") {
    checkoutScm("${config.gitUrl}", "refs/heads/${config.branch}")
    writeFile file: "testing.txt", text: "${config.texting}"
  sh 'cat testing.txt'
               sshagent(['git-id']) {
                sh("git add testing.txt")
                sh("git commit -m 'Updated file'") 
                sh("git push") 
            }

  }  
  
}
