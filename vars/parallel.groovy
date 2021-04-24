def call(Map config) {

			parallel {
			      ubuntu: {
				      echo "Test config.type"
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
			}
	
}

