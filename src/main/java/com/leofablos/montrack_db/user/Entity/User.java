package com.leofablos.montrack_db.user.Entity;


import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Data
@Setter
@Getter
@Table(name = "montrack.users")
public class User {

    @Id
    @GeneratedValue
    @Column("id")
    private long id;

    @Column("username")
    private String username;

    @Column("email")
    private String email;

    @Column("avatar")
    private String avatar;

    @Column("quote")
    private String quote;

    @Column("created_at")
    private Instant createAt;

    @Column("deleted_at")
    private Instant deteledAt;

    @Column("is_deleted")
    private Instant isDeleted;


}
