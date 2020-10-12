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
public class MedicoTest {

	@Deployment
    public static Archive<?> createDeployment() {
        JavaArchive archJar = ShrinkWrap.create(JavaArchive.class)
            .addPackage(Medico.class.getPackage())
            .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(archJar);
        return archJar;
    }
	
	@PersistenceContext
	EntityManager em;
	
	@Test
	@CleanupUsingScript(phase = TestExecutionPhase.AFTER, value="datasets/cleanup.sql")
	@UsingDataSet("datasets/medicos.yml")
	public void test() {
		List<Medico> medicos = em.createQuery("SELECT m FROM Medico m", Medico.class).getResultList();
		for(Medico medico : medicos){
			System.out.println(medico);
		}
	}
}
