def kube(){
		         try {
			    sh "docker stop --name sharedlib"
                            sh "docker run -d -p 80:8080 --name sharedlib nishank/helloworld"
		         } catch (err) {	
		         }
}
