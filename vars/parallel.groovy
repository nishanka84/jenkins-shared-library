def call(Map config, Closure body) {
	stage('parallel') {
		steps {
		      parallel(
			      ubuntu: {
				      echo "Test config.ubun"
				      sleep 10
			      },
			      windows: {
				      echo "Test config.win"
				      sleep 10
			      },
			      unix: {
				      echo "Test config.uni"
				      sleep 10
			      }
		        )
		}
	  body()
	}
	
}

