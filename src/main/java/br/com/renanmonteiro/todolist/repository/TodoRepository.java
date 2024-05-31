package br.com.renanmonteiro.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renanmonteiro.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository <Todo, Long> {

}