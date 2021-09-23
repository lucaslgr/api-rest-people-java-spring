package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Setando que a chave ID vai ser provida pelo BANCO
    private Long id;

    @Enumerated(EnumType.STRING) //Setando relacionamento com EnumType
    @Column(nullable = false) //Setando NOT NULL
    private PhoneType type;

    @Column(nullable = false) //Setando NOT NULL
    private String number;
}
