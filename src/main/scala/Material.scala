import scala.annotation.tailrec

object Material {
  def material(container: List[Int]): Int = {
    @tailrec
    def calc(i: Int, j: Int, wh: Int, acc: Int): Int = {
      if (j == i) acc
      else if (container(i) < container(j)) {
        if (wh < container(i)) {
          calc(i+1, j, container(i), acc)
        } else {
          calc(i+1, j, wh, acc + wh - container(i))
        }
      } else {
        if (wh < container(j)) {
          calc(i, j-1, container(j), acc)
        } else {
          calc(i, j-1, wh, acc + wh - container(j))
        }
      }
    }
    calc(0, container.length-1, if (container.head <= container.last) container.head else container.last, 0)
  }

  def main(args: Array[String]): Unit = {
    this.material(args.toList.map(_.toInt))
  }
}
