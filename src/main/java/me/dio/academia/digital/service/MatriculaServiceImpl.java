package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

    @Autowired
    MatriculaRepository matriculaRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null) {
            return matriculaRepository.findAll();
        } else {
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
