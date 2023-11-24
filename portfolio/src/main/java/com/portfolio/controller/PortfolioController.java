package com.portfolio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/devfolio-master/*")
public class PortfolioController {

	private static final Logger logger = LoggerFactory.getLogger(PortfolioController.class);
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void indexGET() {
		logger.debug(" indexGET() 호출 ");
	}
	
}
