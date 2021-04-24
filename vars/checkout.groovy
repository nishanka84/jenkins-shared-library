def call(Map config){
  
  		   if (params.Git == true) {
             
                       git branch: ${config.master}, url: ${config.url}
                         
		                   
		     } else {
			                 echo " Git or Branch details not specified"
	       }
}
