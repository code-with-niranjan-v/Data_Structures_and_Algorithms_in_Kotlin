

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
    4.pop - remove the first node.

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

    fun push(value: T):LinkedList<T>{
        head = Node(value = value, next = head)
        if(tail == null){
            tail = head
        }
        size++
        return this
    }

    fun append(value: T):LinkedList<T>{
        if(isEmpty()){
            push(value)
            return this
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size++
        return this
    }

    fun nodeAt(index:Int):Node<T>?{

        var currentNode = head
        var currentIndex = 0

        while (currentNode!=null&&currentIndex < index){

            currentNode = currentNode.next
            currentIndex++

        }
        return currentNode

    }

    fun insert(value: T,afterNode:Node<T>):Node<T>{

        if(tail == afterNode){

            append(value)
            return tail!!

        }
        var newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode

    }

    fun pop(): T? {
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next

        if(isEmpty()){
            tail = null
        }

        return result


    }



}