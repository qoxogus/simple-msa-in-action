package com.service.book.dto.book

import java.time.OffsetDateTime

class BookDto(
    val id: Long,
    val name: String,
    val memberId: Long,
    val createdDateTime: OffsetDateTime,
    val updatedDateTime: OffsetDateTime?,
) {
}