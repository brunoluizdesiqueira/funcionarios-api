package github.com.brunoluizdesiqueira.funcionarios.model.repository;

import github.com.brunoluizdesiqueira.funcionarios.model.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

    FuncionarioEntity findById(long id);
}
