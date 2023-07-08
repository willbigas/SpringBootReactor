package br.com.willbigas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public record User(@Id Long id, Long userId, String title, Boolean completed) {
}
