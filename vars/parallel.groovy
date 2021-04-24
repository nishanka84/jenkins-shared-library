def call(Map config) {
		      parallel(
			      ubuntu: {
				      echo "Test config.ubuntu"
				      sleep 10
			      },
			      windows: {
				      echo "Test config.windows"
				      sleep 10
			      },
			      unix: {
				      echo "Test config.unix"
				      sleep 10
			      }
		        )	      
}
return this
