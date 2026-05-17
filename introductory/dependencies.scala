// thats the most strange way to import a lib that ive ever seen
//> using toolkit 0.9.2

@main 
def countFiles(): Unit = 
  // os.pwd will return the current directory path and os.list will count everything thats inside of it
  val paths = os.list(os.pwd)
  println(paths.length)
