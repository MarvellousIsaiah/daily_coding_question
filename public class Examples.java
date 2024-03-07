public class Examples
private boolean isOn  
private int speed = 15
private int gear = 1 //setGear(1)

setters
getters

accelerate() //if gear is 1 speed += 1 // speed = 16
break // if gear is 1 speed -=1 // speed = 14
      
			//false            
1. Test that bike is off
	//expect false
	//assertFalse()
2. Test that bike can be on     
	// call the setter for the isOn instance variable
	//give the setter a true
	//assertTrue(isOn)
3. Test that bike can be turned off 
		// is is off  
		//set it on by calling setter and give it a true value
		// call the setter for the isOn instance variable 
		//give the setter a ffalse
		//assertFalse(isOn)
4. Test the speed
	//check if the bike is on
	// is spped at 0
5. Test that if the gear is at gear 1
	//the bike increases speed by 1
	// i have gear to 15, call a setter setGear to 15
	//call athe acclerate method
6. Test that if gear is at 2:
	//speed incearses by 2
	// if my speed was at 24, and i call accelerate, my speed get to 26

7. Test that if gear is at 1
	// and i press break
	// my speed should deccelerate by 1	