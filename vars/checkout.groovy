def call(Map config){

  if (${config.choice} == true) {
              git branch: ${config.branch}, url: ${config.url}                   
	} else {
	      echo " Git or Branch details not specified"
        }
}
