package com.sic.juluri.person.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sic.juluri.person.model.PC;
import com.sic.juluri.person.repository.PCRepository;

@Service
public class PCService implements PCRepository{

	@Autowired
	private PCRepository pcRepository;

	@Override
	public List<PC> findAll() {
		return pcRepository.findAll();
	}

	@Override
	public List<PC> findAll(Sort sort) {
		return null;
	}

	@Override
	public List<PC> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends PC> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {
		
	}

	@Override
	public <S extends PC> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<PC> entities) {	
		
	}

	@Override
	public void deleteAllInBatch() {

	}

	@Override
	public PC getOne(Long id) {
		return null;
	}

	@Override
	public <S extends PC> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends PC> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<PC> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends PC> S save(S entity) {
		return pcRepository.save(entity);
	}

	@Override
	public Optional<PC> findById(Long id) {
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
	public void delete(PC entity) {
		
	}

	@Override
	public void deleteAll(Iterable<? extends PC> entities) {
		
	}

	@Override
	public void deleteAll() {
		
	}

	@Override
	public <S extends PC> Optional<S> findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends PC> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends PC> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends PC> boolean exists(Example<S> example) {
		return false;
	}
}