package Cine;

public class Cine {

	private Butacas asientos[][];
	private String ButacasDibujo[][];
	private Integer totalButacasOcupadas;

	

	public Cine() {

		asientos = new Butacas[10][10];
		ButacasDibujo = new String[10][10];
		totalButacasOcupadas = 0;

	}

	public void crearAsientos() {

		int i = 0;
		int j = 0;
		for (i = 0; i < asientos.length; i++) {
			for (j = 0; j < asientos.length; j++) {

				asientos[i][j] = new Butacas(i, j);

			}
		}

	}

	public boolean ReservarDeAUno() {

		int i = 0, j = 0;

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {

				if (!asientos[i][j].getEstaOcupado()) {

					asientos[i][j].setEstaOcupado(true);
					ButacasDibujo[i][j] = "X";
					totalButacasOcupadas++;
					return true;
					
				}

			}

		}

		return false;

	}

	public void settearDibujo() {

		int i = 0;
		int j = 0;
		for (i = 0; i < asientos.length; i++) {
			for (j = 0; j < asientos.length; j++) {

				ButacasDibujo[i][j] = "0";

				if (asientos[i][j].getEstaOcupado()) {

					ButacasDibujo[i][j] = "X";

				}

			}
		}

	}

	public String dibujarCine() {

		String mensaje = "";

		int i = 0, j = 0;

		for (i = 0; i < ButacasDibujo.length; i++) {

			mensaje += "\n";

			for (j = 0; j < ButacasDibujo.length; j++) {

				mensaje += "" + ButacasDibujo[i][j] + "|";

			}

		}
		return mensaje;

	}

	public Integer getTotalButacasOcupadas() {
		return totalButacasOcupadas;
	}
	
	public boolean reservaDeAMuchos(int numeroDeAsientos) {
		
		int i = 0, j = 0, cantidadAsientosConsecutivos = 0;
		String guardarIJ[];
		guardarIJ = new String[10];
		
		for (i = 0; i < asientos.length; i++) {
			
			cantidadAsientosConsecutivos = 0;
			
			for (j = 0; j < asientos.length; j++) {

			if(!asientos[i][j].getEstaOcupado()) {
				
				guardarIJ[cantidadAsientosConsecutivos] = "" + i + j;
				cantidadAsientosConsecutivos ++;
				
			}
			
			if(j == 9) {
				
				if(cantidadAsientosConsecutivos >= numeroDeAsientos) {
					
					for(int k = 0; k < numeroDeAsientos; k++) {
						
						String aux_a_String = ""+guardarIJ[k].charAt(0);
						String aux_b_String = ""+guardarIJ[k].charAt(1);
						int aux_a = Integer.parseInt(aux_a_String);
						int aux_b = Integer.parseInt(aux_b_String);
						System.out.println(aux_b_String+aux_a_String+"!");
						asientos[aux_a][aux_b].setEstaOcupado(true);
						ButacasDibujo[aux_a][aux_b] = "X";
						totalButacasOcupadas++;
						
					}
					return true;
				}
				
			}

			}
			
		}
		
		return false;
		
		
	}
	
	
	
	

}
