package com.service.book.service.container

import com.service.book.dto.book.BookWithMemberDto
import com.service.book.service.book.BookService
import com.service.book.service.member.MemberService
import org.springframework.stereotype.Service

@Service
class BookCompositionService(
    private val bookService: BookService,
    private val memberService: MemberService,
) {

    fun getBookWithMemberByBookId(bookId: Long): BookWithMemberDto {
        return bookService.getById(bookId = bookId)
            .let { book ->
                val member = memberService.getById(memberId = book.memberId)

                BookWithMemberDto(
                    id = book.id,
                    name = book.name,
                    member = member,
                    createdDateTime = book.createdDateTime,
                    updatedDateTime = book.updatedDateTime
                )
            }
    }
}