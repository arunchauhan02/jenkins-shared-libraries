def call(String url, String branch){
  echo "Git cloning"
  git url:"${url}",branch:"${branch}"
}
