
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Instanciar*/
		Persona objP, objP1;
		Auto objAuto, objAuto1;
		
		//-----------------------
		objP = new Persona();
		objP.nombre = "Maria";
		objP.cedula = "09582";
		
		objP1 = new Persona();
		objP1.nombre = "Ariel";
	    //-------------------------
		
		objAuto = new Auto();
		objAuto.marca = "Chevrolet";
		objAuto.placa = "LK470";
		objAuto.precio = 1235.84;
		
		objAuto1 = new Auto ();
		objAuto1.marca = "KIA";
		objAuto1.placa = "JD084";
		objAuto1.precio = 84125.28;
		
		System.out.println("Auto = "+objAuto.marca);
		System.out.println(objAuto.precio);		           
		System.out.println(objAuto.placa);
		System.out.println("\n");
		System.out.println("Auto = "+objAuto1.marca);
		System.out.println(objAuto1.precio);		           
		System.out.println(objAuto1.placa);
	
		
	}

}
