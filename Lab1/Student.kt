class Student(
    val id : Int = 0,
    name: String ,
    surname : String,
    patronymic : String,
    tg : String?=null,
    email : String?=null,
    git : String?=null,
    phone : String?=null)
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

        override fun toString(): String {
            var str = "[ID $id] $surname $name $patronymic"
            if (phone != null) str += "\nНомер телефона: $phone"
            if (tg != null) str += "\nТелеграмм: $tg"
            if (email != null) str += "\nМыло: $email"
            if (git != null) str += "\nГит: $git"
            return "$str\n"
        }

        fun info()= println(this.toString())
    
}