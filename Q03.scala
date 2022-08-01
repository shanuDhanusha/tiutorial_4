package tutorial_04

object Q03 extends App {
  def toUpper(s:String):String = {
        s.toUpperCase()
    }

    def toLower(s:String):String = {
        s.toLowerCase()
    }

    def formatNames(name:String, text:(String) => String):String={
        text(name)
    }


    printf("%s\n", formatNames("Benny", toUpper))
    printf("%s\n", formatNames("Niroshan", toUpper))
    printf("%s\n", formatNames("Saman", toLower))
    printf("%s\n", formatNames("Kumara", toLower))
}