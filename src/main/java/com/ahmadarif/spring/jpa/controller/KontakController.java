package com.ahmadarif.spring.jpa.controller;

import com.ahmadarif.spring.jpa.domain.Kontak;
import com.ahmadarif.spring.jpa.repository.KontakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KontakController {

    @Autowired
    private KontakRepository kontakRepository;

    @RequestMapping(value = "/save/{nama}/{alamat}/{noTelp}", method = RequestMethod.GET)
    public String save(@PathVariable String nama, @PathVariable String alamat, @PathVariable String noTelp){

        Kontak k = new Kontak();
        k.setNama(nama);
        k.setAlamat(alamat);
        k.setNoTelp(noTelp);

        kontakRepository.save(k);

        return "simpan data kontak [ " + nama + " ] sukses";
    }

    @RequestMapping(value = "/list")
    public List<Kontak> list(){
        return kontakRepository.findAll();
    }

}