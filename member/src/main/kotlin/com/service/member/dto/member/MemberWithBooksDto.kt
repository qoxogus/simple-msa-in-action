package com.service.member.dto.member

import com.service.member.dto.book.BookDto
import java.time.OffsetDateTime

class MemberWithBooksDto(
    val id: Long,
    val email: String,
    val name: String,
    val createdDateTime: OffsetDateTime,
    val updatedDateTime: OffsetDateTime?,

    val books: List<BookDto>,
) {
}