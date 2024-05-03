package com.service.book.client.member

import com.service.book.dto.member.MemberDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(value = "member-service")
interface MemberClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["/api/v1/members/{memberId}"])
    fun getById(@PathVariable memberId: Long): ResponseEntity<MemberDto>
}