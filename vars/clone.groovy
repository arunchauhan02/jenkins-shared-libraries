def call(string url, string branch){
  echo "Git cloning"
  git url:"${url}",branch:"${branch}"
}
