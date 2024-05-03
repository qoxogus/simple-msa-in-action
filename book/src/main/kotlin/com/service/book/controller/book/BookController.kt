package com.service.book.controller.book

import com.service.book.dto.book.BookWithMemberDto
import com.service.book.dto.book.BookDto
import com.service.book.service.book.BookService
import com.service.book.service.container.BookCompositionService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/books"])
class BookController(
    private val bookService: BookService,
    private val bookCompositionService: BookCompositionService,
) {

    @RequestMapping(method = [RequestMethod.GET], value = ["/hello"])
    fun sayHelloBook(): String {
        return "Hello, Book Service"
    }

    @RequestMapping(method = [RequestMethod.GET], value = ["/{bookId}"])
    fun getById(@PathVariable bookId: Long): BookDto {
        return bookService.getById(bookId = 1L)
    }

    @RequestMapping(method = [RequestMethod.GET], value = ["/{bookId}/members"])
    fun getWithMemberById(@PathVariable bookId: Long): BookWithMemberDto {
        return bookCompositionService.getBookWithMemberByBookId(bookId = 1L)
    }

    @RequestMapping(method = [RequestMethod.GET], value = ["/members/{memberId}"])
    fun getAllByMemberId(@PathVariable memberId: Long): List<BookDto> {
        return bookService.getAllByMemberId(memberId = memberId)
    }
}