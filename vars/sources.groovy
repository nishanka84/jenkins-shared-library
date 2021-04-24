import org.example.Constants
def call(Map config) {
    if (config.type == "slack") {
        echo vars.SLACK_MESSAGE
        echo config.message
    } else {
        echo vars.EMAIL_MESSAGE
        echo config.message
    }
}
