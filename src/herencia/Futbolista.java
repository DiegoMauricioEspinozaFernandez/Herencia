/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author usuario
 */
public class Futbolista extends SeleccionFutbol
{
	private int dorsal;
	private String demarcacion;

    public Futbolista() {
        super();
    }

   

    public Futbolista(int id, String Nombre, String Apellidos, int Edad,int dorsal, String demarcacion ) {
        super(id, Nombre, Apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

  

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    

  
        

	

	public void jugarPartido() {
            System.out.print("juega partido");
		
	}

	public void entrenar() {
            System.out.print("entrena");
		
	}
}