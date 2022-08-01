package tutorial_04
import scala.io.StdIn.readInt
object Q02 extends App{
  printf("Enter integer : ")
    var x:Int = readInt()
    def check(Number:Int):Any = Number match{
        case x if (x<=0) => printf("Negative/Zero")
        case x if (x%2 == 0) => printf("Even Number")
        case x if (x%2 != 0) => printf("Odd Number")
    }

    check(x)
}