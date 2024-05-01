package com.service.member.controller.member

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/members"])
class MemberController {

    @RequestMapping(method = [RequestMethod.GET], value = ["/hello"])
    fun sayHelloMember(): String {
        return "Hello, Member Service"
    }
}