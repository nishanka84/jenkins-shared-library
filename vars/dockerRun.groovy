def call(){
		         try {
			  
		            sh "docker stop modest_thompson "
                            sh "docker run -d -p 80:8080 nishank/helloworld"
		         } catch (err) {
               
                 echo "$err"
				
		         }
}
