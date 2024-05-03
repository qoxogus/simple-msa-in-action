package com.service.member.service.member

import com.service.member.dto.member.MemberDto
import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
class MemberService(

) {

    fun getById(memberId: Long): MemberDto {
        return MemberDto(
            id = 1L,
            email = "member email",
            name = "member name",
            createdDateTime = OffsetDateTime.now(),
            updatedDateTime = OffsetDateTime.now(),
        )
    }
}