package com.ritense.apierik.web

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    // Simulates a Wordpress mail endpoint

    @GetMapping("/wp-json/email/v1/get")
    fun get(): ApiResponse {
        logger.info("Got a GET request")
        Thread.sleep(100000000)
        return ApiResponse("hello", "world")
    }

    // Simulates Smart Documents endpoint
    @PostMapping("/wsxmldeposit/deposit/unattended")
    fun post(@RequestBody bla: Any): ResponseEntity<ApiResponse> {
        logger.info("Got a POST request")
        Thread.sleep(100000000)
        return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
    }


    // Simulates a Objects Api endpoint
    @DeleteMapping("/api/v2/test1")
    fun delete(): ResponseEntity<ApiResponse> {
        logger.info("Got a DELETE request")
        Thread.sleep(100000000)
        return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
    }


    @GetMapping("/badRequest")
    fun error(): ResponseEntity<String> {
        return ResponseEntity("No coffee available. I am a teapot", HttpStatus.I_AM_A_TEAPOT)
    }

    companion object{
        private val logger = LoggerFactory.getLogger(this::class.java)

    }
}
