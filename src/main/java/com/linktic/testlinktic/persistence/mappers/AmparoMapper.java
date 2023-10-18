package com.linktic.testlinktic.persistence.mappers;

import com.linktic.testlinktic.domain.dto.Protection;
import com.linktic.testlinktic.persistence.entities.Amparo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AmparoMapper {

    @Mappings({
            @Mapping(target = "code", source = "codigo"),
            @Mapping(target = "name", source = "nombre")
    })
    Protection toProtection(Amparo amparo);

}
