package com.walmart.test

class FileListerFor {

  def makeRowSeq(row: Int) =
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        println(padding + prod)
      }
    // Returns a row as a string
    def makeRow(row: Int) = makeRowSeq(row).mkString
    // Returns table as a string with one row per line
    def multiTable() = {
      val tableSeq = // a sequence of row strings
        for (row <- 1 to 10)
          yield makeRow(row)
      println(tableSeq.mkString("\n"))
    }


  def fileLister() {
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)
    println("------")

    for (file <- filesHere if file.getName.contains("tt"))
      println(file)
    println("------")

    for (file <- filesHere)
      if (file.getName.contains("tt"))
        println(file)
    println("------")

    for (i <- 0 to filesHere.length - 1)
      println(filesHere(i))
    println("------")

    for (
      file <- filesHere if file.isFile if file.getName.contains("txt")
    ) println(file)
    println("--5----")

    def fileLines(file: java.io.File) =
      scala.io.Source.fromFile(file).getLines().toList
    def grep(pattern: String) =
      for (
        file <- filesHere if file.getName.contains(".txt");
        line <- fileLines(file) if line.trim.matches(pattern)
      ) println(file + ": " + line.trim)
    grep(".*main.*")
    println("--6----")

    def grep2(pattern: String) =
      for {
        file <- filesHere
        if file.getName.endsWith(".txt")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      } println(file + ": " + trimmed)
    grep2(".*Source.*")
    println("--7----")

    def scalaFiles =
      for {
        file <- filesHere
        if file.getName.endsWith(".txt")
      } yield file

    println("scalaFiles")
    val scalaFilesOutput = scalaFiles
    for (scalaFilesOutputSingle <- scalaFilesOutput)
      println(scalaFilesOutputSingle)


  }

}

object FileListerForObject {
  def main(args: Array[String]) {
    val fileListerFor = new FileListerFor();
    fileListerFor.fileLister()
    for (i <- 1 to 4)
      println("Iteration " + i)
    for (i <- 1 until 4)
      println("Iteration " + i)

      fileListerFor.multiTable()
  }
}