def call(string name,string tag){
   echo "Building Image"
   sh "docker build -t ${name}:${tag} ."
}
