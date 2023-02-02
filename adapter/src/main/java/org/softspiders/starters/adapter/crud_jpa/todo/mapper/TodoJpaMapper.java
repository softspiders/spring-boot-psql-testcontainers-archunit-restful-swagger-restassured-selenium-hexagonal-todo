package org.softspiders.starters.adapter.crud_jpa.todo.mapper;

import org.mapstruct.Mapper;
import org.softspiders.starters.adapter.crud_jpa.todo.entity.TodoEntity;
import org.softspiders.starters.domain.model.todo.TodoDomainModel;

import java.time.LocalDateTime;
import java.util.List;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(imports = LocalDateTime.class)
public interface TodoJpaMapper {

    TodoJpaMapper TODO_JPA_MAPPER = getMapper(TodoJpaMapper.class);
    TodoEntity toEntity(TodoDomainModel todoDomainModel);
    TodoDomainModel toDomainModel(TodoEntity todoEntity);
    List<TodoDomainModel> toDomainModelList(List<TodoEntity> todoDomainModelList);
}