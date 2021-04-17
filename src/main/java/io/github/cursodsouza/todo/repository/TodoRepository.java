package io.github.cursodsouza.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursodsouza.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	
}
