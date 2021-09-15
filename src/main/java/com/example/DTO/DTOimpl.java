package com.example.DTO;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;
@Data
public class DTOimpl implements Serializable {
    
	String name;

	String breed;

	String description;

	String ability;
 
	String color;

}
