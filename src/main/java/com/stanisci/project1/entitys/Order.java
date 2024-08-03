package com.stanisci.project1.entitys;
import java.io.Serializable;
import java.time.Instant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity 
public class Order implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
private User client;



public Order(){
}
 public Order (Long id,Instant moment,User client){

this.id=id;
this.moment=moment;
this.client=client;
}   

public User getClient(){
return client;

}

public void setClient(User client){
this.client = client;

}

public Long getId(){
return id;

}

    public void setId(Long id){
    this.id=id;
    
    }

    public Instant getMoment(){
        return moment;

        }
        
        public void setMoment(Instant Moment){
        this.moment=moment;
        
        }

}


