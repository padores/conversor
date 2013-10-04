package test;
public class Conversor {

	public int celsiusParaFahrenheit() {
		return (9 * 40) / 5 + 32;
	}

	public int celsiusParaFahrenheit(int valorCelcius) {
		return (9 * valorCelcius) / 5 + 32;

	}

	public double celsiusParaFahrenheit(double valorCelcius) {
		return (9 * valorCelcius) / 5 + 32;
	}
	

    int fahrenheitParaCelsius(int fahrenheit){	
        return (fahrenheit - 32) * 5 / 9;
    }

    double fahrenheitParaCelsius(double fahrenheit){	
        return (fahrenheit - 32.0) * 5 / 9.0;
    }

    int kelvinParaCelsius(int kelvin){	
        return kelvin - 273;
    }

    double kelvinParaCelsius(double kelvin){	
        return kelvin - 273.0;
    }

    int celsiusParaKelvin(int celsius){	
        return celsius + 273;
    }

    double celsiusParaKelvin(double celsius){	
        return celsius + 273.0;
    }

    int kelvinParaFahrenheit(int kelvin){
        int celsius = kelvin - 273;	
        return celsiusParaFahrenheit(celsius);
    }

    double kelvinParaFahrenheit(double kelvin){
        double celsius = kelvin - 273.0;	
        return celsiusParaFahrenheit(celsius);
    }

    int fahrenheitParaKelvin(int fahrenheit){
        int celsius = fahrenheitParaCelsius(fahrenheit);	
        return celsiusParaKelvin(celsius);
    }

    double fahrenheitParaKelvin(double fahrenheit){
        double celsius = fahrenheitParaCelsius(fahrenheit);	
        return celsiusParaKelvin(celsius);
    }

}
