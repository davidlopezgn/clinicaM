package com.clinica.jpaclinica.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.CleanupUsingScript;
import org.jboss.arquillian.persistence.TestExecutionPhase;
import org.jboss.arquillian.persistence.UsingDataSet;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ReservacionTest {

	@Deployment
    public static Archive<?> createDeployment() {
        JavaArchive archJar = ShrinkWrap.create(JavaArchive.class)
            .addClasses(Medico.class, Agenda.class, Paciente.class, Consultorio.class, Reservacion.class)
            .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(archJar);
        return archJar;
    }
	
	@PersistenceContext
	EntityManager em;
	
	@Test
	@CleanupUsingScript(phase = TestExecutionPhase.AFTER, value="datasets/cleanup.sql")
	@UsingDataSet("datasets/reservaciones.yml")
	public void test() {
		List<Reservacion> reservaciones = em.createQuery("SELECT r FROM Reservacion r", Reservacion.class).getResultList();
		for(Reservacion reservacion : reservaciones){
			System.out.println(reservacion);
		}
	}
}
