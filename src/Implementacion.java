import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos{
	
	List<Clientes> lista = new ArrayList<Clientes>();
	

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		lista.add(cliente);
	}

	@Override
	public Clientes buscar(int indice) {
		// TODO Auto-generated method stub
		Clientes clientes = new Clientes();
		clientes = lista.get(indice);
		return clientes;
	}

	@Override
	public void editar(int indice, Clientes cliente) {
		// TODO Auto-generated method stub
		lista.set(indice, cliente);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public void contar() {
		// TODO Auto-generated method stub
		
	}
	
	public void posicionLista() { ///MOSTRAR POSICIONES DE LA LISTA
		System.out.println("Posiciones en la lista de clientes");

		for (int i = 0; i < lista.size(); i++) {
			System.out.printf("\n[%d]" + lista.get(i).getNombre(), i);

			}		
		}
	}
	
	


