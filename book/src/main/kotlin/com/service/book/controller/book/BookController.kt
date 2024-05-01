package com.service.book.controller.book

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/books"])
class BookController {

    @RequestMapping(method = [RequestMethod.GET], value = ["/hello"])
    fun sayHelloBook(): String {
        return "Hello, Book Service"
    }
}