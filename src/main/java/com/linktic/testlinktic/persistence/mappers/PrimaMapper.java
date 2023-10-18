package com.linktic.testlinktic.persistence.mappers;

import com.linktic.testlinktic.domain.dto.Bonus;
import com.linktic.testlinktic.persistence.entities.Prima;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AmparoMapper.class})
public interface PrimaMapper {

    @Mappings({
            @Mapping(target = "minAge", source = "edadMinima"),
            @Mapping(target = "maxAge", source = "edadMaxima"),
            @Mapping(target = "bonus", source = "prima"),
            @Mapping(target = "protection", source = "amparo"),
    })
    Bonus toBonus(Prima prima);

    List<Bonus> toBonusList(List<Prima> primaList);
}
