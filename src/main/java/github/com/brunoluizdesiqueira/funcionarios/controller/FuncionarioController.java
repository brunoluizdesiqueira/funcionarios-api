package github.com.brunoluizdesiqueira.funcionarios.controller;

import github.com.brunoluizdesiqueira.funcionarios.model.entity.FuncionarioEntity;
import github.com.brunoluizdesiqueira.funcionarios.model.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping("/funcionarios")
    public List<FuncionarioEntity> getAll() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/funcionario/{id}")
    public FuncionarioEntity getById(@PathVariable(value = "id") long id) {
        return funcionarioRepository.findById(id);
    }

    @PostMapping("/funcionario")
    public FuncionarioEntity create(@RequestBody FuncionarioEntity funcionarioEntity) {
        return funcionarioRepository.save(funcionarioEntity);
    }

    @DeleteMapping("/funcionario")
    public ResponseEntity<?> delete(@RequestBody FuncionarioEntity funcionarioEntity) {
        funcionarioRepository.delete(funcionarioEntity);
        return new ResponseEntity<FuncionarioEntity>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/funcionario")
    public FuncionarioEntity update(@RequestBody FuncionarioEntity funcionarioEntity) {
        return funcionarioRepository.save(funcionarioEntity);
    }

}
