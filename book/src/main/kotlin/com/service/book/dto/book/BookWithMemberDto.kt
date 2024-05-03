package com.service.book.dto.book

import com.service.book.dto.member.MemberDto
import java.time.OffsetDateTime

class BookWithMemberDto(
    val id: Long,
    val name: String,
    val member: MemberDto,
    val createdDateTime: OffsetDateTime,
    val updatedDateTime: OffsetDateTime?,
) {
}