fun moveDisk(from: Int, to: Int) {
    println("$from -> $to")
}

fun moveTower(height: Int, from: Int, to: Int, using: Int) {
    if (height < 1) return
    if (height == 1) {
        moveDisk(from, to)
    } else {
        moveTower(height - 1, from, using, to)
        moveDisk(from, to)
        moveTower(height - 1, using, to, from)
    }
}

fun main() {
    println("Tower of Hanoi")
    println("==============")
    println("You have a board with three pins and a tower of disks on one of the pins.")
    println("All disks have different sizes, and there is always a smaller disk on top of a larger.")
    println("You will move the tower of disks from one pin to another using the third pin.")
    println("You can only move one disk at a time, and you are not allowed to place a larger disk on top of a smaller.")
    println("This program will solve how to move the disks.")
    println("You will provide the height of the tower (number of disks) and the pin numbers.")
    val height = print("Height of the tower: ").run { readln().toInt() }
    val from = print("Moving tower from pin number: ").run { readln().toInt() }
    val to = print("Moving tower to pin number: ").run { readln().toInt() }
    val using = print("The third pin number: ").run { readln().toInt() }
    println("\nThis is how to move the disks:")
    moveTower(height, from, to, using)
}