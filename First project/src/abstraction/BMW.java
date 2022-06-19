package abstraction;

public interface BMW {
   
	public static final int a=0;
	//when method is having only declaration
	void speed();//public abstract void speed();
	void Music();
}
interface Audi
{
	void speed();
	void color();
}
//BMW-speed and music
//Audi-speed and color
class Tata implements Audi,BMW{

	@Override
	public void Music() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}
	
}