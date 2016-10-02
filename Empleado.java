package Salarios;

public class Empleado {
	
	//Commit 1, Se generan una clase de Empleado y sus atributos asociados con el empleado...
	
		public String Nombre;
		
		public String Apellido;
		
		public int Edad;
		
		public String Puesto;
		
		public double Salario;
		
		public double Bono;
		
		//Commit 2, Se comienzan a generar los gets y sets para usar dentro del programa

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public String getApellido() {
			return Apellido;
		}

		public void setApellido(String apellido) {
			Apellido = apellido;
		}

		public int getEdad() {
			return Edad;
		}

		public void setEdad(int edad) {
			Edad = edad;
		}

		public String getPuesto() {
			return Puesto;
		}

		public void setPuesto(String puesto) {
			Puesto = puesto;
		}

		public double getSalario() {
			return Salario;
		}

		public void setSalario(double salario) {
			Salario = salario;
		}

		public double getBono() {
			return Bono;
		}

		public void setBono(double bono) {
			Bono = bono;
		}
		
		//Commit #3, se genera un empleado para este trabajo y generamos un main para empezar a imprimir los datos
		//del empleado
		
		static Empleado nuevo = new Empleado();
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			nuevo.setNombre("Edgar");
			nuevo.setApellido("Rangel");
			nuevo.setEdad(20);
			nuevo.setPuesto("Empleado");
			nuevo.setSalario(1000.00);			
			System.out.println("Este es el empleado " + nuevo.getNombre() + " " + 
			nuevo.getApellido() + " , Edad: " + nuevo.getEdad() + " , Puesto: " + nuevo.getPuesto() + 
			" y su Salario: " + nuevo.getSalario());
		}

}
