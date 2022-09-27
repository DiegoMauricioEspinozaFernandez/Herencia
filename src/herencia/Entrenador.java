/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author usuario
 */
public class Entrenador extends SeleccionFutbol
{

	private String idFederacion;

        public Entrenador() {
		super();
	}

    

    public Entrenador(int id, String Nombre, String Apellidos, int Edad, String idFederacion) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

   

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
        

	

	public void dirigirPartido() {
            System.out.print("dirige un partido");
			
	}

	public void dirigirEntreno() {
            System.out.print("dirige un entrenamiento");
		
	}
}
