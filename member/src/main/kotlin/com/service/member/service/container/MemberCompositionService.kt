package com.service.member.service.container

import com.service.member.dto.member.MemberWithBooksDto
import com.service.member.service.book.BookService
import com.service.member.service.member.MemberService
import org.springframework.stereotype.Service

@Service
class MemberCompositionService(
    private val memberService: MemberService,
    private val bookService: BookService,
) {

    fun getMemberWithBooks(memberId: Long): MemberWithBooksDto {
        return memberService.getById(memberId = memberId)
            .let { member ->
                val booksOwnedByMember = bookService.getAllByMemberId(memberId = memberId)

                return MemberWithBooksDto (
                    id = member.id,
                    email = member.email,
                    name = member.name,
                    createdDateTime = member.createdDateTime,
                    updatedDateTime = member.updatedDateTime,
                    books = booksOwnedByMember,
                ) 
            }
    }
}