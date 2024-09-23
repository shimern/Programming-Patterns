
fun main() {
    val students = mutableListOf<Student>()
    students.add(Student(1, "Никита", "Шемякин", "Павлович"))
    students.add(Student(2, "Грыжа", "Лесная", "Дубович", "@dyplo", "test@example.com", "https://github.com/test123", "+79999999999https://github.com/test123"))
    students.add(Student(3, "Килька", "Томатная", "Здоровая", tg="@kilkya", git="https://github.com/kilkya"))

    students.forEach { it.info() }
}


