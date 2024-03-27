
// TASK:
// Implement a stack without using .pop / .push / .peek methods - create your own versions

class Stack()  {

    private var stack: MutableList<Any> = mutableListOf()

    fun push(item: Any): MutableList<Any> {
        stack.add(item)
        return stack
    }

    fun pop(): Any {
        val lastItem = stack.last()
        stack.remove(lastItem)
        return lastItem
    }

    fun peek(): Any {
        return stack.last()
    }

}