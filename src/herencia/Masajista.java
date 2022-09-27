/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author usuario
 */
public class Masajista extends SeleccionFutbol
{

	private String Titulacion;
	private int aniosExperiencia;

        public Masajista() {
		super();
	}


    public Masajista( int id, String Nombre, String Apellidos, int Edad, String Titulacion, int aniosExperiencia) {
        super(id, Nombre, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
        

	

	public void darMasaje() {
            System.out.print("da masaje");
	
	}
}
