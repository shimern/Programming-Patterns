
fun main() {

    val students = mutableListOf(
        Student(mapOf(
            "id" to 1,
            "surname" to "Шемякин",
            "name" to "Никита",
            "patronymic" to "Павлович"
        )),
        Student(mapOf(
            "id" to 2,
            "surname" to "Лесная",
            "name" to "Грыжа",
            "patronymic" to "Дубович",
            "phone" to "+79999999999",
            "telegram" to "@dyplo",
            "email" to "gryja@example.com",
            "git" to "https://github.com/gryja"
        )),
        Student(mapOf(
            "id" to 3,
            "surname" to "Томатная",
            "name" to "Килька",
            "patronymic" to "Здоровая",
            "telegram" to "@kilkya",
            "git" to "https://github.com/kilkya"
        )),
        Student(mapOf(
            "id" to 4,
            "surname" to "Фарфоровый",
            "name" to "Крабик",
            "patronymic" to "Полноразмерный",
            "phone" to "+79999999999"
        ))
    )

    students.add(Student(5, "Зайковский", "Денис", "Алексеевич", "https://github.com/lavr",))
    students.add(Student(6, "Лавров", "Захар", "Игоревич",email= "lavr@example.com", phone="+79999999999"))


    students.forEach { it.info() }
    students.forEach { it.validate_tg() }
    students.forEach { it.validate_git() }

    students[4].setContacts(mapOf("email" to "zayka@example.com"))
    students[4].info()
}


