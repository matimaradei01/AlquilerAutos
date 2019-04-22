import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {

		ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();

		listaDeVehiculos.add(new Vehiculo("HFP 902", "Fernando", 40000));
		listaDeVehiculos.add(new Vehiculo("IMU 983", "Matias", 35000));
		listaDeVehiculos.add(new Vehiculo("AKK 234", "Jose", 120000));
		listaDeVehiculos.add(new Vehiculo("AQS 022", "Carlos", 400000));
		listaDeVehiculos.add(new Vehiculo("AB 492 SS", "Camila", 12000));
		listaDeVehiculos.add(new Vehiculo("KIQ 277", "Josefina", 35000));
		listaDeVehiculos.add(new Vehiculo("NKD 224", "Yamila", 878));
		listaDeVehiculos.add(new Vehiculo("UTT 989", "Lucia", 54233));
		listaDeVehiculos.add(new Vehiculo("FUE 789", "Mateo", 42111));
		listaDeVehiculos.add(new Vehiculo("UTH 540", "Franco", 25555));

		Vehiculo objeto = new Vehiculo();
		objeto.BuscarVehiculos(listaDeVehiculos);

	}

}
