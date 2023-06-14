

//Linked List
/*

    A linked list has head, tail and size of the list.
    Head -> first node
    Tail -> last node
    Size -> total number of nodes in a list

    Operations in Linked list

    1.push - add value at the beginning of the list.
    2.append - add value at the end of the list.
    3.insert - insert value at a particular node.

 */


class LinkedList<T> {

    private var head:Node<T>? = null
    private var tail:Node<T>? = null
    private var size = 0

    fun isEmpty():Boolean{

        return size==0

    }

    override fun toString(): String {
        return if(isEmpty()){
            "Empty List"
        } else{
            head.toString()
        }
    }

    fun push(value: T){
        head = Node(value = value, next = head)
        if(tail == null){
            tail = head
        }
        size++
    }
}