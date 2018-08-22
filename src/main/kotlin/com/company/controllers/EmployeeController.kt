package com.company.controllers

import com.company.model.Employees
import com.company.repository.EmployeeRepository
import com.company.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeeController(private val employeeRepository: EmployeeRepository,
                         private val employeeService: EmployeeService) {

    @GetMapping("")
    fun findAll() = employeeService.findAll()

    @GetMapping("/{employeer_id}")
    fun findById(@PathVariable employeer_id:Long) = employeeService.getById(employeer_id)

    @PostMapping("")
    fun save(@RequestBody employee: Employees) = employeeRepository.save(employee)
}