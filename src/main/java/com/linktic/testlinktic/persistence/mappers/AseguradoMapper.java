package com.linktic.testlinktic.persistence.mappers;

import com.linktic.testlinktic.domain.dto.InsuredPerson;
import com.linktic.testlinktic.persistence.entities.Asegurado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AseguradoMapper {

    @Mappings({
            @Mapping(target = "idNumber", source = "numIdentificacion"),
            @Mapping(target = "idType", source = "tipIdentificacion"),
            @Mapping(target = "lastname", source = "apellidos"),
            @Mapping(target = "name", source = "nombres"),
            @Mapping(target = "gender", source = "sexo"),
            @Mapping(target = "bithday", source = "fechaNacimiento"),
    })
    InsuredPerson toInsuredPerson(Asegurado asegurado);



}
