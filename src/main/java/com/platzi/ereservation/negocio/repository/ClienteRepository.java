package com.platzi.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.platzi.ereservation.modelo.Cliente;

/*
 * Interface para definir las operaciones de BD relacionadas con cliente. 
 */

public interface ClienteRepository extends JpaRepository<Cliente, String> {

	/*
	 * Definición de método para busqueda de clientes por su apellido.
	 * 
	 * @param apellidoCli;
	 * 
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);

	public Cliente findByIdentificacion(String identificacionCli);

}
