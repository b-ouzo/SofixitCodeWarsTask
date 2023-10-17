import org.scalatest.funsuite.AnyFunSuite

class MaterialTest extends AnyFunSuite{
  test("Material.material.typicalCase") {
    assert(Material.material(
      List(6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3)) == 83
    )
    assert(Material.material(
      List(6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0)) == 50
    )
    assert(Material.material(
      List(6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0)) == 50
    )
    assert(Material.material(
      List(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)) == 6
    )
    assert(Material.material(
      List(0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2)) == 8
    )
    assert(Material.material(
      List(4, 2, 0, 3, 2, 5)) == 9
    )
  }
  test("Material.material.limitTests") {
    assert(Material.material(List(1,2)) == 0)
    assert(Material.material(List(1)) == 0)
  }
}



