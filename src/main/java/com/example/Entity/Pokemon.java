package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pokemon implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
@Column
String name;
@Column
String breed;
@Column
String description;
@Column
String ability;
@Column
String color;
}
