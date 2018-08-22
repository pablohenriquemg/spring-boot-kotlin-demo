package com.company.model

import com.company.shared.Gender
import java.time.LocalDate
import javax.persistence.*

@Entity
class Employees (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val birth_date: LocalDate? = null,
        val first_name: String? = null,
        val last_name: String? = null,
        val gender: Gender? = null,
        val hire_date: LocalDate? = null
)