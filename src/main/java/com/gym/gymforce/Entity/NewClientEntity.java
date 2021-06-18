package com.gym.gymforce.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table ( name = "GYN_FORCE")

public class NewClientEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String birthDay;
    private String cpf;
    private Boolean stats;

    public long getId() {return id;   }
    public void setId(long id) {id = id;   }

    public String getName() {return name;   }
    public void setName(String name) {this.name = name;   }

    public String getBirthDay() {return birthDay;   }
    public void setBirthDay(String birthDay) {this.birthDay = birthDay;   }

    public String getCpf() { return cpf;   }
    public void setCpf(String cpf) { this.cpf = cpf;   }

    public Boolean getStats() {return stats;  }
    public void setStats(Boolean stats) {this.stats = stats;   }

    public NewClientEntity (){

    }

    ////Construtor
    public NewClientEntity (String name, String birthDay, String cpf, Boolean stats) {
        this.name = name;
        this.birthDay = birthDay;
        this.cpf = cpf;
        this.stats = stats;

}




}
