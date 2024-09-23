
fun main() {

    val students = mutableListOf(
        Student(mapOf(
            "id" to 1,
            "surname" to "Шемякин",
            "name" to "Никита",
            "patronym" to "Павлович"
        )),
        Student(mapOf(
            "id" to 2,
            "surname" to "Лесная",
            "name" to "Грыжа",
            "patronym" to "Дубович",
            "phone" to "+79999999999",
            "telegram" to "@dyplo",
            "email" to "gryja@example.com",
            "git" to "https://github.com/gryja"
        )),
        Student(mapOf(
            "id" to 3,
            "surname" to "Томатная",
            "name" to "Килька",
            "patronym" to "Здоровая",
            "telegram" to "@kilkya",
            "git" to "https://github.com/kilkya"
        )),
        Student(mapOf(
            "id" to 4,
            "surname" to "Фарфоровый",
            "name" to "Крабик",
            "patronym" to "Полноразмерный",
            "phone" to "79999999999"
        ))
    )

    students.add(Student(5, "Денис", "Зайковский", "Алексеевич", "https://github.com/lavr",))
    students.add(Student(6, "Захар", "Лавров", "Игоревич",email= "lavr@example.com", phone="+79999999999"))


    students.forEach { it.info() }
}


