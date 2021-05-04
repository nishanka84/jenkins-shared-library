def call(Map config){
  checkoutScm("${config.gitUrl}", "refs/heads/${config.branch}")
  dir ("${env.WORKSPACE}") {
    writeFile file: "testing.txt", text: "${config.texting}"
  sh 'cat testing.txt'
               sshagent(['git-id']) {
                sh("git add ${testing.txt}")
                sh("git commit -m 'Updated file'")
                sh("git pull origin refs/heads/${config.branch}") 
                sh("git push origin HEAD:refs/heads/${config.branch}") 
            }

  }  
  
}
