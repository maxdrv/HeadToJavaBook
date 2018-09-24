// risky, exception-throwing code:

public void takeRisk() throws BadException{ //declare that method can throws th exception
	if(abandonAllHope) {
		throw new BadException();  // create new exception obj and trows it
	}
}

// one method will catch what another method throws
// an exceprtion is always thrown back to the caller
// the method that throws has to declare that it might throw the exception

public void crossFingers({
	try{
		anObject.takeRisk();
	} catch(BadException ex){
		System.out.println("Aaargh!");
		ex.printStackTrace();   // можно получить стак трайс - этот метод наслежуют все эксепшены
	}
}

// A finally block is where you put code that must run regardless of an exception
try{
	turnOvenOn();
	x.bake();
} catch (BakingException ex){
	ex.printStackTrace();
} finally {
	turnOvenOff();
}
// если что то должно выполниться несмотря на результат try/catch, то следует использовать finally
try{
	turnOvenOn();
	x.bake();
	turnOvenOff();
} catch (BakingException ex){
	ex.printStackTrace();
	turnOvenOff();
}

// if try/catch has return statement, finally will start run! flow jumps to the finally then back to the return