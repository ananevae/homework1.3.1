package ru.netology

fun agoToText (seconds: Int): String {
    val text = when (seconds) {
        in 0..60 -> "только что"
        in 61..60 * 60 -> endMin(seconds / 60) + " назад"
        in 60 * 60 + 1..24 * 60 * 60 -> "в сети " + endHour(seconds / 60 / 60) + " назад"
        in 24 * 60 * 60 +1..24 * 60 * 60 * 2 -> "в сети сегодня"
        in 24 * 60 * 60 * 2..24 * 60 * 60 * 3 -> "в сети вчера"
        else -> "в сети давно"
    }
    return text
}

fun endMin (min: Int): String {
    val text = when {
        (min % 10 == 1) && (min % 100 != 11) -> "$min минуту"
        (min % 10 == 2) && (min % 100 != 12) -> "$min минуты"
        (min % 10 == 3) && (min % 100 != 13) -> "$min минуты"
        (min % 10 == 4) && (min % 100 != 14) -> "$min минуты"
        else -> "$min минут"
    }
    return text
}

fun endHour (hours: Int): String {
    val text = when {
        (hours % 10 == 1) && (hours % 100 != 11) -> "$hours час"
        (hours % 10 == 2) && (hours % 100 != 12) -> "$hours часа"
        (hours % 10 == 3) && (hours % 100 != 13) -> "$hours часа"
        (hours % 10 == 4) && (hours % 100 != 14) -> "$hours часа"
        else -> "$hours часов"
    }
    return text
}

fun main() {
    val seconds = 765

    println("был(а) " + agoToText(seconds))
}

