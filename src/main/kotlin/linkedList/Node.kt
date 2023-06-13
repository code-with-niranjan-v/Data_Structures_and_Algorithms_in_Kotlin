package linkedList

//Linked List
/*

    Linked List is a collection of values that are arranged in single direction.

    To be More specific, it is a collection of nodes.

    Node -> Node holds a value and the reference to the next value.


 */

data class Node<T>(var value:T,var next:Node<T>? = null){

    override fun toString(): String {

        return if(next!= null){

            "$value -> ${next.toString()}"

        }else{
            "$value"
        }

    }

}