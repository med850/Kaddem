package com.exemple.Kaddem.ServiceInterface;
import java.util.List;
import com.exemple.Kaddem.Entity.Contrat;

public interface ContratServiceInterface {

    public List<Contrat> retrieveAllContrats();
    public Contrat addContrat (Contrat ce);
    public Contrat updateContrat (Contrat ce);
    public Contrat retrieveContrat (Integer idContrat);
    public void removeContrat(Integer idContrat);

}