/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tomas.Service;

import com.example.tomas.Entity.Persona;
import com.example.tomas.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    public List<Persona> list() {
        return ipersonaRepository.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return ipersonaRepository.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return ipersonaRepository.findByNombre(nombre);
    }

    public void save(Persona persona) {
        ipersonaRepository.save(persona);
    }

    public void delete(int id) {
        ipersonaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return ipersonaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return ipersonaRepository.existsByNombre(nombre);
    }

    public List<Persona> getPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void savePersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deletePersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona findPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona getOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void edit(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
