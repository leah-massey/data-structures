import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun `initially, list is empty`() {
        val underTest = Stack()
        val expected: MutableList<Any> = mutableListOf()
        val actual = underTest.stack

        assertEquals(expected, actual)
    }

    @Test
    fun `an item is added to the list`() {
        val underTest = Stack()
        val expected = mutableListOf("cat")
        val actual = underTest.push("cat")

        assertEquals(expected, actual)
    }

    @Test
    fun `the last item added is removed from the list and returned`() {
        val underTest = Stack()
        underTest.push("cat")
        underTest.push("dog")

        val expectedReturnValue = "dog"
        val actualReturnValue = underTest.pop()
        assertEquals(expectedReturnValue, actualReturnValue)

        val expectedList = mutableListOf("cat")
        val actualList = underTest.stack
        assertEquals(expectedList, actualList)
    }

    @Test
    fun `the last item added is returned but not removed from the list`() {
        val underTest = Stack()
        underTest.push("cat")
        underTest.push("dog")

        val expectedReturnValue = "dog"
        val actualReturnValue = underTest.peek()
        assertEquals(expectedReturnValue, actualReturnValue)

        val expectedList = mutableListOf("cat", "dog")
        val actualList = underTest.stack

        assertEquals(expectedList, actualList)
    }

    @Test
    fun `an empty list returns null when pop called`() {
        val underTest = Stack()

        val expectedReturnValue = null
        val actualReturnValue = underTest.pop()
        assertEquals(expectedReturnValue, actualReturnValue)
    }

    @Test
    fun `an empty list returns null when peek called`() {
        val underTest = Stack()

        val expectedReturnValue = null
        val actualReturnValue = underTest.peek()
        assertEquals(expectedReturnValue, actualReturnValue)
    }
}