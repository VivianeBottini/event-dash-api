package br.com.projetofinal.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Evento;

public interface EventoDAO extends CrudRepository<Evento,Integer>{

	//List<Evento> findByBuscaBetween(Date inicio, Date fim);

	/*@Query(value="SELECT count(numSeq) as total FROM ITMN_EVENTO WHERE "
			+ " cadastro >= :inicio  AND cadastro <= :fim  AND alarme_id= :num", nativeQuery = true)
			long getByTotal(@Param("inicio") Date inicio, @Param("fim") Date fim, @Param("num") int num);
		*/

}//fecha class