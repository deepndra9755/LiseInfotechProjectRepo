package com.example.Controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.DTOimpl;
import com.example.Entity.Pokemon;
import com.example.Service.IPokemonService;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

@Autowired
IPokemonService ipok;

@PostMapping("/add")
public String addPokemon(@RequestBody Pokemon poj)
{
	System.out.println(poj);
	DTOimpl obj=new DTOimpl();
	BeanUtils.copyProperties(poj, obj);
	return ipok.addNewPokemon(obj); 	
}

@PutMapping("/update")
public String updatePokemon(@RequestBody Pokemon poj)
{
	//System.out.println(id);
	System.out.println(poj);
	return ipok.updatingPokemon(poj);
	 //ipok.addNewPokemon(poj); 	
}

@GetMapping("/remove")
public String removePokemon(@RequestParam("id") Integer id)
{
System.out.println(id);
return ipok.removePokemon(id);	
}

@GetMapping("/findALL")
public List<DTOimpl> findAllPokemons()
{
	
	return ipok.FindAllPok();
}

}
