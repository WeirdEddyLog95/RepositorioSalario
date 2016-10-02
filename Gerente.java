package Salarios;

public class Gerente extends Empleado {
		
	//Commit #4, Se extiende  los atributos de datos hacia la gerencia para el empleado
	public static void main(String[] args){
			//Commit #5, se crea un nuevo empleado y se ponen nombres y la gerencia a la que pertenece y el salario que tiene
		Empleado nuevo = new Empleado();
		nuevo.setNombre("Edgar");
		nuevo.setApellido("Rangel");
		nuevo.setEdad(20);
		nuevo.setPuesto("Gerencia");
		nuevo.setSalario(1000.00);
		//Commit #6, se hace un if para identificar si el empleado es gerente y saca un porcentaje de su salario como
		//bonificacion
	if(nuevo.getPuesto()=="Gerencia"){
		double bono;
		double porcentaje;
		porcentaje= .50;
		bono= ((nuevo.getSalario()*porcentaje));
		nuevo.setBono(bono);
		System.out.println("Este es el empleado " + nuevo.getNombre() + " " + 
		nuevo.getApellido() + " , Edad: " + nuevo.getEdad() + " , Puesto: " + nuevo.getPuesto() + 
		" Salario: " + nuevo.getSalario() + " Bonificacion: " + nuevo.getBono() + "");
	} else {
		//Commit #7, se agrega otra condicion en caso de que el empleado resulte ser que no es un gerente 
		System.out.println("Este empleado " + nuevo.getNombre() + " " + nuevo.getApellido() + " no es un Gerente, es"
		+ " un... " + nuevo.getPuesto() + " asi que no hay bonificacion de esta gerencia para este empleado");
	}
}
}
