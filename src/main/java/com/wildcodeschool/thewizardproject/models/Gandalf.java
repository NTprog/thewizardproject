package com.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

	private Outfit outfit;
	
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
