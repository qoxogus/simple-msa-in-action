package com.service.member.controller.system

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
@RequestMapping(value = ["/api/v1/members"])
class SystemController {

    @Value("\${server.port}")
    lateinit var port: String

    @Value("\${spring.application.name}")
    lateinit var applicationName: String

    @Value("\${refresh-test.word}")
    lateinit var refreshedWord: String

    @RequestMapping(method = [RequestMethod.GET], value = ["/health-check"])
    fun checkHealth(): String {
        return "$applicationName running on $port"
    }

    @RequestMapping(method = [RequestMethod.GET], value = ["/words"])
    fun getRefreshedWordForConfigRefreshTest(): String {
        return refreshedWord
    }
}