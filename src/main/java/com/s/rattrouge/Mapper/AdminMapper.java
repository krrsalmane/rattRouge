package com.s.rattrouge.Mapper;


import com.s.rattrouge.Dto.AdminDTO;
import com.s.rattrouge.Entity.Admin;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdminMapper {

    AdminDTO toDTO(Admin admin);
    Admin toEntity(AdminDTO dto);
    List<AdminDTO> toDTOs(List<Admin> admins);

}
