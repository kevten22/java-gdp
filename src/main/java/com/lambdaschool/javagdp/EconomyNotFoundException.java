package com.lambdaschool.javagdp;

public class EconomyNotFoundException extends RuntimeException{
    public EconomyNotFoundException(Long id){
        super("Could not find Economy");
    }
}
