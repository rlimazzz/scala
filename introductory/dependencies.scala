// thats the most strange way to import a lib that ive ever seen
//> using dep "com.lihaoyi::os-lib:0.11.8"

@main 
def countFiles(): Unit = 
  // os.pwd will return the current directory path and os.list will count everything thats inside of it
  val paths = os.list(os.pwd)
  println(paths.length)
