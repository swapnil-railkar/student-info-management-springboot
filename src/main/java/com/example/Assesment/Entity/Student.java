package com.example.Assesment.Entity;

import com.example.Assesment.Dto.Role;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 *  Student entity.
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = 4267128822521552717L;

    /**
     *  Primary key - auto generated.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *  username of student
     */
    @Column(unique = true)
    private String userName;

    /**
     *  password
     */
    @Column(unique = true)
    private String password;

    /**
     *  Role : student / admin
     */
    private String role;

    /**
     *  Student name.
     */
    private String name;

    /**
     *  Student address.
     */
    private String address;

    /**
     *  Subjects enrolled by student.
     */
    @ManyToMany(targetEntity = Subject.class)
    private List<Subject> subjects;

}
