package dev.taina.chatlol.adapters.out;

import dev.taina.chatlol.domain.model.Champion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
SOLUÇÃO ORM: aproximar paradigma de uma aplicação OO ao paradigma de um
banco de dados relacional

Uma outra forma de criar o Repository usufruindo mais das abstrações fornecidas
pelo Spring
Desse modo, tem-se abstração de todas as operações de CRUD relaciondas ao
banco de dados
Bastante eficiente, mas pra quem está começando, é bom saber o que ocorre
por baixo dos panos
*/

@Repository
public interface ChampionsDataJdbcRepository extends CrudRepository<Champion, Long> {
}
