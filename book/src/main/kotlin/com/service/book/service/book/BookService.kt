package com.service.book.service.book

import com.service.book.dto.book.BookDto
import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
class BookService(

) {

    fun getById(bookId: Long): BookDto {
        return BookDto(
            id = 1L,
            name = "book name",
            memberId = 1L,
            createdDateTime = OffsetDateTime.now(),
            updatedDateTime = OffsetDateTime.now(),
        )
    }

    fun getAllByMemberId(memberId: Long): List<BookDto> {
        return listOf(
            BookDto(
                id = 1L,
                name = "book name",
                memberId = 1L,
                createdDateTime = OffsetDateTime.now(),
                updatedDateTime = OffsetDateTime.now(),
            ),
            BookDto(
                id = 2L,
                name = "book name",
                memberId = 1L,
                createdDateTime = OffsetDateTime.now(),
                updatedDateTime = OffsetDateTime.now(),
            )
        )
    }
}