package br.com.artureloi.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.artureloi.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
