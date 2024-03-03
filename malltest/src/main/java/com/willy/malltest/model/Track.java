package com.willy.malltest.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Data
@Entity
@Table(name = "Track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackID;

    @Column(name = "SpecID")
    private String specID;

    @Column(name = "UserID")
    private Long userID;

    public Track() {
    }
}
