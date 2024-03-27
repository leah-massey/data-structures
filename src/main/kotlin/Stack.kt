// TASK:
// Implement a stack without using .pop / .push / .peek methods - create your own versions
// .push adds an item to the stack
// .pop removes the top item from the stack (the last item added) and returns it
// .peek returns the top item from the stack

class Stack() {

    var stack: MutableList<Any> = mutableListOf()

    fun push(item: Any) {
        stack.add(item)
    }

    fun pop(): Any? {

        if (stack.isEmpty()) {
            return null
        } else {
            val lastItem = stack.last()
            stack.remove(stack.last())
            return lastItem
        }
    }
    fun peek(): Any? {

        if (stack.isEmpty()) {
            return null
        } else {
            return stack.last()
        }
    }

}