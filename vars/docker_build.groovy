def call(){
   echo "Building Image"
   sh "docker build -t backend:latest ."
}
