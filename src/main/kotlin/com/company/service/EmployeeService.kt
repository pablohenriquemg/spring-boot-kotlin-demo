package com.company.service

import com.company.model.EmployeeDTO
import com.company.model.Employees
import com.company.repository.DepartmentRepository
import com.company.repository.EmployeeRepository
import com.company.repository.SalaryRepository
import com.company.repository.TitleRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository,
                      private val titleRepository: TitleRepository,
                      private val salaryRepository: SalaryRepository,
                      private val departmentRepository: DepartmentRepository) {

    fun getById(employeer_id: Long): EmployeeDTO {

        var employee = employeeRepository.findById(employeer_id).get()
        var titles = titleRepository.findByEmployee(employee)
        var salaries = salaryRepository.findByEmployee(employee)
        var departments = departmentRepository.findByEmployees(employee)

        return EmployeeDTO(employee.id, employee.birth_date, employee.first_name,
                employee.last_name, employee.gender, employee.hire_date, salaries, titles, departments)
    }

    fun findAll() : List<Employees> {

        var employees = employeeRepository.findTop10ByOrderByIdDesc()

        return employees
    }
}