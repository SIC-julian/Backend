package com.sic.juluri.person.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sic.juluri.person.model.State;
import com.sic.juluri.person.repository.StateRepository;

@Service
public class StateService implements StateRepository{
	
	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<State> findAll() {
		return stateRepository.findAll();
	}
	
	public List<State> findAllByCountry (Long id){
		List<State> estadosRespuesta= new ArrayList<>();
		List<State> estados= stateRepository.findAll();
		for (int i=0; i<estados.size(); i++) {
			if (estados.get(i).getPc().getId()==id) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;
	}

	@Override
	public List<State> findAll(Sort sort) {
		return stateRepository.findAll(sort);
	}

	@Override
	public List<State> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends State> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {
		
	}

	@Override
	public <S extends State> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<State> entities) {
		
	}

	@Override
	public void deleteAllInBatch() {
		
	}

	@Override
	public State getOne(Long id) {
		return null;
	}

	@Override
	public <S extends State> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends State> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<State> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends State> S save(S entity) {
		return null;
	}

	@Override
	public Optional<State> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		
	}

	@Override
	public void delete(State entity) {
		stateRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends State> entities) {
		stateRepository.deleteAll(entities);		
	}

	@Override
	public void deleteAll() {
		stateRepository.deleteAll();
	}

	@Override
	public <S extends State> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends State> Page<S> findAll(Example<S> example, Pageable pageable) {
		return stateRepository.findAll(example, pageable);
	}

	@Override
	public <S extends State> long count(Example<S> example) {
		return stateRepository.count(example);
	}

	@Override
	public <S extends State> boolean exists(Example<S> example) {
		return stateRepository.exists(example);
	}
}