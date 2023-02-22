package exercice_2;

public class Temperature {
    private int temperature;
	
	public Temperature(int temperature) {
		this.temperature = temperature;
	}
			
	public int getFahrenheit() {
		return temperature;
	}
	
	public int getCelsius() {
		return 5*(temperature - 32)/9;
	}

	@Override
	public String toString() {
		return "La température est de " + getFahrenheit() +" degrés Fahrenheit" + " ou de " + getCelsius() + " degrés Celsius.";
	}
}
