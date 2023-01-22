
public class Ejcirculo {
	public double r;
	public Ejcirculo() {
		r=160808;
	}
	public double calcCirc()
	{
		return 3.1416*2*r;
	}
	public double calcAreac()
	{
		return 3.1416*(Math.pow(r, 2));
	}
	public void radioDife(double o) {
		r=o;
	}

}
