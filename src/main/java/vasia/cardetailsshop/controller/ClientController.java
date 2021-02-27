package vasia.cardetailsshop.controller;

import org.springframework.web.bind.annotation.*;
import vasia.cardetailsshop.entity.Client;
import vasia.cardetailsshop.service.client.impls.ClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    ClientService clientService;
    @GetMapping
    public List<Client> getAll(@RequestParam(required = false, defaultValue = "1") Integer page,
                               @RequestParam(required = false, defaultValue = "10") Integer size){
        return clientService.getAll();
    }
    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id){
        return clientService.getById(id);
    }

    @PostMapping
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }

    @PutMapping("/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client){
        return clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        clientService.delete(id);
    }

    @GetMapping("/{clientId}/orders")
    public List<Client> getOrdersByClient(@PathVariable Long clientId){
        return null;
    }
}
