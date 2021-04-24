def execute() {		   
	              catchError(buildResult: 'SUCCESS', stageResult: 'UNSTABLE') {
		                     sh "docker build -t helloworld:latest ." 
		                     sh "docker tag helloworld nishank/helloworld:latest"

	              }
}
