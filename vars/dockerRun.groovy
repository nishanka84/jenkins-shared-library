def kube(){
		         try {
			 
                            sh "docker run -d -p 80:8080 -name sharedlib nishank/helloworld"
		         } catch (err) {	
		         }
}
