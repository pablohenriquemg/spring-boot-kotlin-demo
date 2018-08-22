package com.company.service

import com.company.model.Salaries
import com.company.model.Titles
import com.company.repository.EmployeeRepository
import com.company.repository.SalaryRepository
import org.springframework.stereotype.Service

@Service
class SalaryService(private val salaryRepository: SalaryRepository,
                    private val employeeRepository: EmployeeRepository) {

    fun save(salary: Salaries, employeer_id: Long): Salaries {
        if (salary == null) {
            throw RuntimeException()
        }

        if(employeer_id != null){
            var employee = employeeRepository.findById(employeer_id)
            salary.employee = employee.get()
        }
        return salaryRepository.save(salary)
    }
}