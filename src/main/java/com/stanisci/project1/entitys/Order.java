package com.stanisci.project1.entitys;
import java.time.Instant;

public class Order {
    private Long id;
    private Instant moment;
private User client;

public Order(){
}
 public Order (Long id,Instant moment,User client){
super();
this.id=id;
this.moment=moment;
this.client=client;


 }   
}


