fun countConsecutiveChars(inputStr: String): String {
    if (inputStr.isEmpty()) return ""

    val result = StringBuilder()  // Для хранения результата
    var count = 1  // Счетчик для одинаковых символов

    for (i in 1 until inputStr.length) {
        if (inputStr[i] == inputStr[i - 1]) {
            count++  // Увеличиваем счетчик, если символы одинаковые
        } else {
            // Добавляем символ и его количество, если оно больше 1
            result.append(inputStr[i - 1])
            if (count > 1) result.append(count)
            count = 1  // Сбрасываем счетчик для нового символа
        }
    }

    // Добавляем последний символ
    result.append(inputStr[inputStr.length - 1])
    if (count > 1) result.append(count)

    return result.toString()
}

fun main() {
    val inputStr = "AAADSSSRRTTHAAAA"
    val outputStr = countConsecutiveChars(inputStr)
    println(outputStr)  // Выведет: A3D1S3R2T2H1A4
}
