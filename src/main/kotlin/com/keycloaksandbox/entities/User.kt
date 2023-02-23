package com.keycloaksandbox.entities


import com.keycloaksandbox.database.Fields.Companion.EMAIL
import com.keycloaksandbox.database.Fields.Companion.ID
import com.keycloaksandbox.database.Fields.Companion.NAME
import com.keycloaksandbox.database.Fields.Companion.USER
import com.keycloaksandbox.database.Tables.Companion.DB_USERS
import jakarta.persistence.*
import jakarta.persistence.FetchType.EAGER

@Entity
@Table(name = DB_USERS)
class User(

    @Id
    @GeneratedValue
    @Column(name = ID)
    var id: Long,

    @Column(name = NAME)
    var name: String,

    @Column(name = EMAIL)
    var email: String,

    @OneToMany(mappedBy = USER, fetch = EAGER)
    var roles: Set<Role>)