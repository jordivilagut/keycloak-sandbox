package com.keycloaksandbox.entities

import com.keycloaksandbox.database.Fields.Companion.ID
import com.keycloaksandbox.database.Fields.Companion.NAME
import com.keycloaksandbox.database.Fields.Companion.USER_ID
import com.keycloaksandbox.database.Tables.Companion.DB_ROLES
import jakarta.persistence.*

@Entity
@Table(name = DB_ROLES)
class Role(

    @Id
    @GeneratedValue
    @Column(name = ID)
    var id: Long,

    @Column(name = NAME)
    var name: String,

    @ManyToOne
    @JoinColumn(name = USER_ID)
    var user: User)