package com.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("DumbledoreId")
public class Dumbledore implements WizardInterface{

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Fly you fools !";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return "cahnge";
	}
}
