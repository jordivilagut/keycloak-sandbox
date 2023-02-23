package com.keycloaksandbox.repositories

import com.keycloaksandbox.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository : JpaRepository<User, Long>