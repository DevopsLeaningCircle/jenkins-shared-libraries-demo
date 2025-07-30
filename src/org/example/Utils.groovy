package org.example

class Utils {
    
    static String getBuildInfo(env) {
        return "Build Number: ${env.BUILD_NUMBER}, Branch: ${env.BRANCH_NAME}"
    }
}