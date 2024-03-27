// TASK:
// Implement a stack without using .pop / .push / .peek methods - create your own versions

class Stack() {

    var stack: MutableList<Any> = mutableListOf()

    fun push(item: Any): MutableList<Any> {
        stack.add(item)
        return stack
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