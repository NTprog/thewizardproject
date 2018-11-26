package com.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {

	private Outfit outfit;
	
	@Autowired
	public Gandalf(Outfit outfit) {
		this.outfit = outfit;
	}
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Fly you fools !";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return outfit.changeDress();
	}
}
