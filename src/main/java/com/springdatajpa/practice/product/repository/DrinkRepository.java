package com.springdatajpa.practice.product.repository;

import com.springdatajpa.practice.product.entity.Drink;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@EnableJpaRepositories
public class DrinkRepository implements JpaRepository<Drink, Integer> {
    @Override
    public List<Drink> findAll() {
        return null;
    }

    @Override
    public List<Drink> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Drink> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Drink> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Drink entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Drink> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Drink> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Drink> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Drink> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Drink> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Drink> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Drink> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Drink getOne(Integer integer) {
        return null;
    }

    @Override
    public Drink getById(Integer integer) {
        return null;
    }

    @Override
    public Drink getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Drink> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Drink> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Drink> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Drink> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Drink> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Drink> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Drink, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
