package com.service.member.dto.book

import java.time.OffsetDateTime

class BookDto(
    val id: Long,
    val name: String,
    val createdDateTime: OffsetDateTime,
    val updatedDateTime: OffsetDateTime?,
) {
}