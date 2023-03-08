package com.keycloaksandbox.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class UsersController {

    @GetMapping("/", "/login")
    fun login() = ModelAndView("login")
}