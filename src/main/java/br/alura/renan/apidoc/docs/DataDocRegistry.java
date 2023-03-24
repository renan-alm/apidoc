package br.alura.renan.apidoc.docs;

import br.alura.renan.apidoc.address.DataAddress;

// NOTE: THIS IS A DTO, data transfer object. For use whenever you are sending or receiving data in an api
public record DataDocRegistry(String name, String email, String crm, Specialization specialization, DataAddress address) {


}
