package se.academy.Pant.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Schoolclass {

    @Id
    @GeneratedValue
    private int classId;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private String school;
    private String className;
    private String contactPerson;
}
