package org.venuspj.htmx.admin.domain.model.person;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface PersonRepository extends R2dbcRepository<Person, Long> {

}
