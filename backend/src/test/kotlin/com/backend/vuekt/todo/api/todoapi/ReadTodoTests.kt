package com.backend.vuekt.todo.api.todoapi

import com.backend.vuekt.todo.api.TodoApi
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(TodoApi::class)
class ReadTodoTests(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `Assert get right contents`() {
        /* when */
        val actions = mockMvc.perform(get("/api/v1/"))

        /* then */
        actions.andExpect(status().isOk)
                .andExpect(content().string("Hello Todo"))
    }

}