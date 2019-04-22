import java.util.ArrayList;

public class Vehiculo {

	private String placaVehiculo;
	private String personaAlquila;
	private Integer kilometraje;

	public Vehiculo(String placaVehiculo, String personaAlquila, Integer kilometraje) {

		this.placaVehiculo = placaVehiculo;
		this.personaAlquila = personaAlquila;
		this.kilometraje = kilometraje;

	}

	public Vehiculo() {

	}

	public void BuscarVehiculos(ArrayList<Vehiculo> listaDeVehiculos) {

		System.out.println("Los vehiculos que contienen entre 20.000 y 100.000km son :");
		for (Vehiculo v1 : listaDeVehiculos) {
			if (v1.getKilometraje() > 20000 && v1.getKilometraje() < 100000) {

				System.out.println(v1.toString());
			}

		}

	}

	public void VerListar(ArrayList<Vehiculo> listaDeVehiculos) {

		for (Vehiculo v1 : listaDeVehiculos) {

			System.out.println(v1.toString());

		}

	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public String getPersonaAlquila() {
		return personaAlquila;
	}

	public void setPersonaAlquila(String personaAlquila) {
		this.personaAlquila = personaAlquila;
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}

	@Override
	public String toString() {
		return "El vehiculo con patente " + placaVehiculo + " es alquilado por " + personaAlquila
				+ " y tiene el kilometraje  " + kilometraje;
	}

}
