class Student(
    val id : Int = 0,
    name: String ,
    surname : String,
    patronymic : String ,
    tg : String?,
    email : String?,
    git : String?,
    phone : String?)
    {
        var surname = surname
            get() = field
            set(value) { field = value }

        var name = name
            get() = field
            set(value) { field = value }

        var patronymic = patronymic
            get() = field
            set(value) { field = value }

        var tg = tg
            get() = field
            set(value) { field = value }

        var email = email
            get() = field
            set(value) { field = value }

        var git = git
            get() = field
            set(value) { field = value }

        var phone = phone
            get() = field
            set(value) { field = value }

    
}
