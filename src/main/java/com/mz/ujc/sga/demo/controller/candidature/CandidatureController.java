/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mz.ujc.sga.demo.controller.candidature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Fenias Cossa
 */
@Controller
@RequestMapping("/candidatura")
public class CandidatureController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getLogin() {
        return "candidature/lg";
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String getForm1() {
        return "/candidature/register/register";
    }
}
