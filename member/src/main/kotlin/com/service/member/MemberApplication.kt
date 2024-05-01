package com.service.member

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class MemberApplication

fun main(args: Array<String>) {
	runApplication<MemberApplication>(*args)
}
