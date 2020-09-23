package br.itau.justificativa.dao;

import org.springframework.data.repository.CrudRepository;

import br.itau.justificativa.model.Ocorrencia;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia, Integer> {
    
}
