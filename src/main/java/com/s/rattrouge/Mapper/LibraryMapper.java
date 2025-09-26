package com.s.rattrouge.Mapper;


import com.s.rattrouge.Dto.LibraryDTO;
import com.s.rattrouge.Entity.Library;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LibraryMapper {

    LibraryDTO toDTO (Library library);
    Library toEntity (LibraryDTO dto);
    List<LibraryDTO> toDTOs (List<Library> libraries);
}
