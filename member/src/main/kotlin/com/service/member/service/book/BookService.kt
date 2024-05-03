package com.service.member.service.book

import com.service.member.client.book.BookClient
import com.service.member.dto.book.BookDto
import org.springframework.stereotype.Service

@Service
class BookService(
    private val bookClient: BookClient,
) {

    fun getById(bookId: Long): BookDto {
        return bookClient.getById(bookId = bookId).body!!
    }

    fun getAllByMemberId(memberId: Long): List<BookDto> {
        return bookClient.getAllByMemberId(memberId = memberId).body!!
    }
}