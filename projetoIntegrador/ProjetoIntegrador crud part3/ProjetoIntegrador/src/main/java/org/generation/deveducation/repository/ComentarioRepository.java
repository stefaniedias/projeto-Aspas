package org.generation.deveducation.repository;

	
	import org.springframework.data.jpa.repository.JpaRepository;

	import com.deveducation.aspas.model.ComentarioModel;

	public interface ComentarioRepository extends JpaRepository<ComentarioModel,Long> {
		

}
