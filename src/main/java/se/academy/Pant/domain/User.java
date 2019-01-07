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
public class User {

    @Id
    @GeneratedValue
    private int userId;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private String name;
}
