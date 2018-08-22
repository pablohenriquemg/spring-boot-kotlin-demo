package com.company.model

import com.company.shared.Gender
import java.io.Serializable
import java.time.LocalDate

class EmployeeDTO (

        val id: Long = 0,
        val birth_date: LocalDate? = null,
        val first_name: String? = null,
        val last_name: String? = null,
        val gender: Gender? = null,
        val hire_date: LocalDate? = null,

        var salaries: List<Salaries> = mutableListOf<Salaries>(),

        var titles: List<Titles> = mutableListOf<Titles>(),

        var departments: List<Departments> = mutableListOf<Departments>()
)