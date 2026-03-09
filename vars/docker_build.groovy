def call(String name,String tag,String user){
   echo "Building Image"
   sh "docker build -t ${user}/${name}:${tag} ."
}
