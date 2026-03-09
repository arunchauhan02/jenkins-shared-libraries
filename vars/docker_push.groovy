def call(String project,String ImageTag,String dockerhubuser){
  withCredentials([usernamePassword(
                    credentialsId:"dockerhubcred",
                    passwordVariable:"dockerHubPassword",
                    usernameVariable:"dockerHubUser")]){
                        sh "docker login -u ${dockerhubuser} -p ${dockerHubPassword}"
                        sh "docker push ${dockerhubuser}/${project}:${ImageTag}"
                }
}
