def call(Map config){
 // git url:"${config.gitUrl}", branch: "refs/heads/${config.type}"
  dir ("${env.WORKSPACE}") {
    writeFile file: "testing.txt", text: "${config.texting}"
  sh 'cat testing.txt'
               sshagent(['git-id']) {
                sh("git add ${testing.txt}")
                sh("git commit -m 'Updated file'")
                sh("git pull origin refs/heads/${config.type}") 
                sh("git push origin HEAD:refs/heads/${config.type}") 
            }

  }  
  
}
