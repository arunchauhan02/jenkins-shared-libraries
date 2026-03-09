def call(String name,String tag){
   echo "Building Image"
   sh "docker build -t ${name}:${tag} ."
}
