import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, app;
		int edad;
		long telefono, saldo = 0;

		Clientes cliente = null;
		Scanner lectura = null;
		int menuP, indice;
		long deposito = 0l,retiro=0l;
		Implementacion imp = new Implementacion();

		do {
			System.out.println("----------CAJERO AUTOMATICO----------");
			System.out.println("1---ALTA CLIENTE");
			System.out.println("2---CONSULTAR SALDO");
			System.out.println("3---DEPOSITO EN EFECTIVO");
			System.out.println("4---RETIRO EN EFECTIVO");
			System.out.println("5---SALIR");

			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();

			switch (menuP) {

			/*
			 * try {
			 * 
			 * } catch (NumberFormatException e) { // La opción no es un número válido
			 * System.out.println("La opción ingresada no es válida."); return; }
			 */
			case 1:// ALTA USUARIO
					// PEDIR DATOS AL USUARIO
				try {
					System.out.println("INGRESE EL NOMBRE");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("INGRESE EL APELLIDO PATERNO");
					lectura = new Scanner(System.in);
					app = lectura.nextLine();

					System.out.println("INGRESE LA EDAD");
					lectura = new Scanner(System.in);
					edad = lectura.nextInt();

					System.out.println("INGRESE EL TELEFONO");
					lectura = new Scanner(System.in);
					telefono = lectura.nextLong();

					System.out.println("INGRESE EL SALDO INICIAL");
					lectura = new Scanner(System.in);
					saldo = lectura.nextLong();
					if (saldo<=10000) {
						if(saldo % 100 == 0) {

					cliente = new Clientes(nombre, app, edad, telefono, saldo);
					imp.guardar(cliente);
						}
						else {
							System.out.println("CANTIDAD NO PERMITIDA :(. PRUEBE UNA CANTIDAD MÚLTIPLO DE $100");

						}
					}
					else {
						System.out.println("Cantidad no permitida. Pruebe una cantidad menor a $10,000 ");

					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;

			case 2://CONSULTAR SALDO
				try {
					//MOSTRAR REGISTROS
					imp.posicionLista();
					System.out.println("\nINGRESE EL INDICE DE LA PERSONA PARA CONSULTAR SALDO");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// BUSCAR
					cliente = imp.buscar(indice);
					System.out.println("Su saldo actual es: $" + cliente.getSaldo());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al consultar saldo " + e.getMessage());
					System.out.println("Por favor intentelo de nuevo");

				}

				break;

			case 3://DEPOSITAR

				try {
					//MOSTRAR REGISTROS
					imp.posicionLista();
					System.out.println("\nINGRESE EL INDICE DE LA PERSONA PARA PARA DEPOSITAR");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					//BUSCAR
					cliente = imp.buscar(indice);
					System.out.println("INGRESE LA CANTIDAD A DEPOSITAR (MÁXIMO $10000): ");
					lectura = new Scanner(System.in);
					deposito = lectura.nextLong();
					if (deposito<=10000) {
						if(deposito % 100 == 0) {
							saldo = cliente.getSaldo();
							//ACTUALIZACION
							saldo = saldo + deposito;
							cliente.setSaldo(saldo);
							imp.editar(indice, cliente);
							System.out.println("DEPOSITO EXITOSO. \nSU SALDO ACTUAL ES:" + cliente.getSaldo());
						}
						else {
							System.out.println("CANTIDAD NO PERMITIDA :(. PRUEBE UNA CANTIDAD MÚLTIPLO DE $100");

						}
					} else {
						System.out.println("Cantidad no permitida. Pruebe una cantidad menor a $10,000 ");
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL DEPOSITAR " + e.getMessage());
				}
				break;

			case 4://Retiro
				try {
					//MOSTRAR REGISTROS
					imp.posicionLista();
					System.out.println("\nINGRESE EL INDICE DE LA PERSONA PARA PARA DEPOSITAR");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					//BUSCAR
					
					cliente = imp.buscar(indice);
					System.out.println("INGRESE LA CANTIDAD A RETIRAR (MÁXIMO $10000): ");
					lectura = new Scanner(System.in);
					retiro = lectura.nextLong();
					if (retiro<=10000) {
						if(retiro % 100 == 0) {

					saldo = cliente.getSaldo();

					//ACTUALIZACION
					saldo = saldo - retiro;
					cliente.setSaldo(saldo);
					imp.editar(indice, cliente);
					System.out.println("RETIRO EXITOSO. \nSU SALDO ACTUAL ES:" + cliente.getSaldo());
						}
						else {
							System.out.println("CANTIDAD NO PERMITIDA :(. PRUEBE UNA CANTIDAD MÚLTIPLO DE $100");
						}
					}
					else {
						System.out.println("Cantidad NO PERMITIDA. PRUEBE UNA CANTIDAD MENOR A $10,000 ");

					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL RETIRAR " + e.getMessage());
					
				}
				break;

			case 5:
				break;


			}

		} while (menuP < 5);
	}

}
