package com.keycloaksandbox.repositories

import com.keycloaksandbox.entities.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RolesRepository : JpaRepository<Role, Long>