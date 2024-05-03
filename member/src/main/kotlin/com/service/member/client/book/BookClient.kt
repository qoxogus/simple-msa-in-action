package com.service.member.client.book

import com.service.member.dto.book.BookDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(value = "book-service")
interface BookClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["/api/v1/books/{bookId}"])
    fun getById(@PathVariable bookId: Long): ResponseEntity<BookDto>

    @RequestMapping(method = [RequestMethod.GET], value = ["/api/v1/books/members/{memberId}"])
    fun getAllByMemberId(@PathVariable memberId: Long): ResponseEntity<List<BookDto>>
}