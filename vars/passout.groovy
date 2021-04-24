
def call(Map config) {

    git branch: config.type, url: config.message
           
}
return this
