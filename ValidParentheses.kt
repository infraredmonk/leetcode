class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack: ArrayDeque<Char> = ArrayDeque<Char>()
        for (c in s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.addLast(c)
            } else {
                when (c) {
                    ')' -> if (stack.isEmpty() || !stack.removeLast().equals('(')) return false
                    '}' -> if (stack.isEmpty() || !stack.removeLast().equals('{')) return false
                    ']' -> if (stack.isEmpty() || !stack.removeLast().equals('[')) return false
                }
            }
        }
        return stack.isEmpty()
    }
}

// {()}
fun main(args: Array<String>) {
    println(ValidParentheses().isValid("["))
}
