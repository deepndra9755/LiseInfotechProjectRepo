package com.example.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.PokemoneRepo;
import com.example.DTO.DTOimpl;
import com.example.Entity.Pokemon;

@Service
public class IPokemonImpl implements Serializable, IPokemonService {

	@Autowired
	PokemoneRepo obj;
	
	@Override
	public String addNewPokemon(DTOimpl ob) {
		// TODO Auto-generated method stub
		Pokemon pok=new Pokemon();
		BeanUtils.copyProperties(ob, pok);
		Pokemon ps=obj.save(pok);
        if(ps.getId()==0)
        {
        	
        	return "Pokemon insertion got failed";
        }
       
	   return "Pokemon got inserted id "+ps.getId();
	}

	@Override
	public String removePokemon(Integer id) {
		// TODO Auto-generated method stub
		if(obj.existsById(id))
		{
		obj.deleteById(id);
		return "record deleted by given id "+id; 
		}
		return "given id record does't found ";
	}

	@Override
	public List<DTOimpl> FindAllPok() {
		// TODO Auto-generated method stub
        List<DTOimpl> obj1=new ArrayList<DTOimpl>();    
		List<Pokemon> all=obj.findAll();
            for(Pokemon pok:all)
            {
            	
             DTOimpl obj=new DTOimpl();
             BeanUtils.copyProperties(pok, obj);
             obj1.add(obj);
            }
		return obj1;
	}

	@Override
	public String updatingPokemon(Pokemon obj4) {
		// TODO Auto-generated method stub
		
		if(obj.existsById(obj4.getId()))
		{
		 	obj.save(obj4);
		 	return "record updated";
		 	
		}
		return "record does't exit";
	}

}
