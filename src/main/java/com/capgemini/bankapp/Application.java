package com.capgemini.bankapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.bankapp.config.AppConfig;
import com.capgemini.bankapp.controller.BankAccountController;
import com.capgemini.bankapp.exception.LowBalanceException;


public class Application {
public static void main(String[] args) throws LowBalanceException {
//	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	BankAccountController bankAccountController = context.getBean(BankAccountController.class);
	System.out.println(bankAccountController.getBalance(2025));
	System.out.println(bankAccountController.withdraw(2025,1200));
	System.out.println(bankAccountController.deposit(2025, 1100));
	System.out.println(bankAccountController.fundTransfer(2024, 2025,2100));
}
}



