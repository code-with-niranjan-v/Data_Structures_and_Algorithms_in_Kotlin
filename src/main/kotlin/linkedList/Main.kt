

fun main() {

    val linkedList = LinkedList<Int>()
    //Pushing
    linkedList.push(3).push(2).push(1).push(0)
    //Appending
    println(linkedList.append(4).append(5))
    //Finding the node
    println(linkedList.nodeAt(3))
    var nodeAt = linkedList.nodeAt(3)!!
    //Inserting the Node
    linkedList.insert(10,nodeAt)
    println(linkedList)
    //Pop
    linkedList.pop()
    println(linkedList)

}