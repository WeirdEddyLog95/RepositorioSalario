package Salarios;

public class Contador {
	
	//Commit #8, Pasamos al empleado a esta clase, para generar un empleado para la area de contaduria
	public static void main(String[] args){
	//Commit #9, Comenzamos nuevamente a crear un empleado de contaduria y agregamos un salario
		Empleado nuevo = new Empleado();
		nuevo.setNombre("Edgar");
		nuevo.setApellido("Rangel");
		nuevo.setEdad(20);
		nuevo.setPuesto("Contador");
		nuevo.setSalario(955.00);
	//Commit #10, Comenzamos a generar nuevamente una condicion para saber si el empleado que tenemos es un
	//contador, para que reciba una ganancia extra con bonificacion de su puesto
	if(nuevo.getPuesto()=="Contador"){
		double bono;
		double porcentaje;
		porcentaje= .35;
		bono= ((nuevo.getSalario()*porcentaje));
		nuevo.setBono(bono);
		System.out.println("Este es el empleado " + nuevo.getNombre() + " " + 
		nuevo.getApellido() + " , Edad: " + nuevo.getEdad() + " , Puesto: " + nuevo.getPuesto() + 
		" Salario: " + nuevo.getSalario() + " Bonificacion: " + nuevo.getBono() + "");
	} else {
	//Commit #11, Comenzamos a generar otra condicion para saber que el empleado que no es contador, reciba ningun bono
	//porque esta en un area donde no debe
		System.out.println("Este empleado " + nuevo.getNombre() + " " + nuevo.getApellido() + " no es un Contador, es"
		+ " un... " + nuevo.getPuesto() + " asi que no hay bonificacion de la contaduria para este empleado");
	}
}
}
