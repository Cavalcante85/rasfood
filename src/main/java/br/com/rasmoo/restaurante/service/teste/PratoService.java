package br.com.rasmoo.restaurante.service.teste;

import br.com.rasmoo.restaurante.entity.Prato;

import java.beans.PersistenceDelegate;

public class PratoService {

    public static void main(String[] args) {
        Prato risoto = new Prato();

        risoto.setNome("Resoto de frutos do mar");
        risoto.setDescricao("Risoto acompanhado de Lula, polvo e marisco");
        risoto.setDisponivel(true);
        risoto.setValor(88.50);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "persistenceUnitName: rasFood");


        EntityManager entityManager = entityManagerFactory.createEntityManagerFactory();

        entityManager.getTransaction().begin();
        entityManager.persit(risoto);
        entityManager.getTransaction().commit();
        entityManager.close();


    }
}
