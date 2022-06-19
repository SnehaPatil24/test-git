package abstraction;

interface Hero{
  
	void splender();
	void shine();
}
//one year they have support for each other
interface Honda extends Hero
{
	//honda interface has how many method ---2
	void Activa();
}
class Sparepart
{
	
}
public class Factory extends Sparepart implements Honda{

	@Override
	public void splender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Activa() {
		// TODO Auto-generated method stub
		
	}
 }
