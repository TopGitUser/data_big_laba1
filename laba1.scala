import scala.util.Random

object Laba1 extends App {

  def generateRandomNumbers(size: Int, upperBound: Int): List[Int] = {
    List.fill(size)(Random.nextInt(upperBound))
  }

  def sumGreaterThanX(numbers: List[Int], x: Int): Int = {
    numbers.filter(_ > x).sum
  }

  def countLessThanX(numbers: List[Int], x: Int): Int = {
    numbers.count(_ < x)
  }

  def processNumbers(): Unit = {
    val randomNumbers = generateRandomNumbers(20, 100)
    
    println("Введите число X:")
    val x = scala.io.StdIn.readInt()

    val sum = sumGreaterThanX(randomNumbers, x)
    val count = countLessThanX(randomNumbers, x)

    println(s"Список случайных чисел: $randomNumbers")
    println(s"Сумма чисел больше $x: $sum")
    println(s"Количество чисел меньше $x: $count")
  }

  processNumbers()
}
