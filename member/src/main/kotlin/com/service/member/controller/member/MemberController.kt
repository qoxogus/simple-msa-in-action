package com.service.member.controller.member

import com.service.member.dto.member.MemberDto
import com.service.member.dto.member.MemberWithBooksDto
import com.service.member.service.container.MemberCompositionService
import com.service.member.service.member.MemberService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime

@RestController
@RequestMapping(value = ["/api/v1/members"])
class MemberController(
    private val memberService: MemberService,
    private val memberCompositionService: MemberCompositionService,
) {

    @RequestMapping(method = [RequestMethod.GET], value = ["/hello"])
    fun sayHelloMember(): String {
        return "Hello, Member Service"
    }

    @RequestMapping(method = [RequestMethod.GET], value = ["/{memberId}"])
    fun getById(@PathVariable memberId: Long): MemberDto {
        return memberService.getById(1L)
    }

    @RequestMapping(method = [RequestMethod.GET], value = ["/{memberId}/books"])
    fun getWithBooksById(@PathVariable memberId: Long): MemberWithBooksDto {
        return memberCompositionService.getMemberWithBooks(memberId = 1L)
    }
}