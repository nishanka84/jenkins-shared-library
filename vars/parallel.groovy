def call(Map config) {
	stage('parallel') {
		steps {
		      parallel(
			      ubuntu: {
				      echo "Test config.ubun"
				      sleep 10
			      },
			      windows: {
				      echo "Test windows"
				      sleep 10
			      },
			      unix: {
				      echo "Test unix"
				      sleep 10
			      }
		        )
		}
	 
	}
	
}

