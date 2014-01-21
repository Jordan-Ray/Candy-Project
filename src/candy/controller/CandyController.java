package candy.controller;

import javax.swing.JOptionPane;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;
	
	public CandyController()
	{
		
	}
	
	public void Start()
	{
		promptForInfo();
		makeMonster();
	}
	
	private void promptForInfo()
	{
		
	}
	
	private void makeMonster()
	{
		myCreature = new MarshmallowCreature("Abagochie", 3, 2, 0, false);
			
		
	}
}
