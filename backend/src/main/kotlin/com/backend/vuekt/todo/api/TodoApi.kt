package com.backend.vuekt.todo.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class TodoApi {

    @GetMapping("/")
    fun readTodo(): String {
        return "Hello Todo"
    }

}