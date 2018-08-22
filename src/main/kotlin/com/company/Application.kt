package com.company

import com.company.model.Departments
import com.company.model.Employees
import com.company.model.Salaries
import com.company.model.Titles
import com.company.repository.DepartmentRepository
import com.company.repository.EmployeeRepository
import com.company.repository.SalaryRepository
import com.company.repository.TitleRepository
import com.company.shared.Gender
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.time.LocalDate
import java.time.temporal.TemporalQueries

@SpringBootApplication
class Application {

}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
