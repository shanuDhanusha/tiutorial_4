package tutorial_04

object Q01 extends App{
  def interest(amount:Double):Double = {
        amount match{
            case d if d<0 => 0
            case d if d<20000 => d*.02f
            case d if d<200000 => d*.04f
            case d if d<2000000 => d*.035f
            case d if d>=2000000 => d*.065f
        }
    }
    printf("%.2f", interest(1205600))
}