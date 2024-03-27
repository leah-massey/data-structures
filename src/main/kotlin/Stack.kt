
// TASK:
// Implement a stack without using .pop / .push / .peek methods - create your own versions

class Stack()  {

    private var stack: MutableList<Any> = mutableListOf()

    // add to stack
    fun push(item: Any): MutableList<Any> {
        stack.add(item)
        return stack
    }

    // remove and return last item added to stack
    fun pop(): Any {
        val lastItem = stack.last()
        stack.remove(lastItem)
        return lastItem
    }

    // view last item added to stack
    fun peek(): Any {
        return stack.last()
    }

}