/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class HerenciaMain {

    /**
     * @param args the command line arguments
     */
   

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();

	public static void main(String[] args) {

		Entrenador entrenador = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista futbolista = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Masajista masajista = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(entrenador);
		integrantes.add(futbolista);
		integrantes.add(masajista);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		/*for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Concentrarse();
                        System.out.println();
		}*/
                for(int i=0; i<integrantes.size();i++){
                      
                        System.out.print(integrantes.get(i).getNombre()+" "+integrantes.get(i).getApellidos()+" -> ");
			integrantes.get(i).Concentrarse();
                        System.out.println();
                
                
                }

		// VIAJE
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Viajar();
                        System.out.println();
		}
        
        // ENTRENAMIENTO
System.out.println("Entrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
System.out.print(entrenador.getNombre()+" "+entrenador.getApellidos()+" -> ");
entrenador.dirigirEntreno();
System.out.println();
System.out.print(futbolista.getNombre()+" "+futbolista.getApellidos()+" -> ");
futbolista.entrenar();
System.out.println();

// MASAJE
System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
System.out.print(masajista.getNombre()+" "+masajista.getApellidos()+" -> ");
masajista.darMasaje();
System.out.println();

// PARTIDO DE FUTBOL
System.out.println("nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
System.out.print(entrenador.getNombre()+" "+entrenador.getApellidos()+" -> ");
entrenador.dirigirPartido();
System.out.println();
System.out.print(futbolista.getNombre()+" "+futbolista.getApellidos()+" -> ");
futbolista.jugarPartido();
        
        
        
        
        }


}
    
