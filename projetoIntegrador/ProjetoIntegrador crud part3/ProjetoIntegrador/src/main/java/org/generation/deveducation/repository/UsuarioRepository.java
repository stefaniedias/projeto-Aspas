package org.generation.deveducation.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deveducation.aspas.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

	public List<UsuarioModel> findAllByNomeCompletoContainingIgnoreCase(String nomeCompleto);

}
