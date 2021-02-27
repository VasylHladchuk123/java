package vasia.cardetailsshop.service.client.interfaces;

import vasia.cardetailsshop.entity.Client;

import java.util.List;

public interface IClientService {
    List<Client> getAll();
    Client getById(Long id);
    Client create(Client client);
    Client update(Long id, Client client);
    void delete(Long id);
}
