package com.example.Service;

import java.util.List;

import com.example.DTO.DTOimpl;
import com.example.Entity.Pokemon;

public interface IPokemonService {
public String addNewPokemon(DTOimpl ob);
public String removePokemon(Integer id);
public List<DTOimpl> FindAllPok();
public String updatingPokemon(Pokemon obj);
}
