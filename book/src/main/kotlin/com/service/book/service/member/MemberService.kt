package com.service.book.service.member

import com.service.book.client.member.MemberClient
import com.service.book.dto.member.MemberDto
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberClient: MemberClient,
) {

    fun getById(memberId: Long): MemberDto {
        return memberClient.getById(memberId = memberId).body!!
    }
}