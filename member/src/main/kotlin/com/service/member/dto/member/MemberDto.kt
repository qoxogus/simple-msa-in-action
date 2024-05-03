package com.service.member.dto.member

import java.time.OffsetDateTime

class MemberDto(
    val id: Long,
    val email: String,
    val name: String,
    val createdDateTime: OffsetDateTime,
    val updatedDateTime: OffsetDateTime?,
) {
}