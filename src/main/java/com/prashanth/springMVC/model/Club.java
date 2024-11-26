package com.prashanth.springMVC.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "club")
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String photoUrl;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    LocalDateTime createdOn;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    LocalDateTime updatedOn;
}
