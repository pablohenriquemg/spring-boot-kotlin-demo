package com.company.controllers

import com.company.model.Titles
import com.company.repository.TitleRepository
import com.company.service.TitleService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/titles")
class TitleController(private val titleRepository: TitleRepository,
                      private val titleService: TitleService) {

    @GetMapping("")
    fun findAll() = titleRepository.findAll()

    @PostMapping("")
    fun save(@RequestBody title: Titles,
             @RequestParam("employeer_id") employeer_id: Long) = titleService.save(title, employeer_id)
}