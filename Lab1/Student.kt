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

        constructor(id: Int,
                    surname: String,
                    name: String,
                    patronym: String,
                    git: String) : this(id, surname, name, patronym) {
            this.git = git
            println("second constructor for git")
        }
        constructor(id: Int,
                    surname: String,
                    name: String,
                    patronym: String,
                    email: String,
                    phone: String) : this(id, surname, name, patronym) {
            this.email = email
            this.phone = phone
            println("second constructor for email and phone")
        }

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


        init {
            this.surname = surname
            this.name = name
            this.patronymic = patronymic
            this.phone = phone
            this.tg = tg
            this.email = email
            this.git = git
        }
}