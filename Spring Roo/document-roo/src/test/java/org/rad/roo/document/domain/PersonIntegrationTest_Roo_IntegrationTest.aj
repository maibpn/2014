// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import java.util.Iterator;
import java.util.List;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.rad.roo.document.domain.Person;
import org.rad.roo.document.domain.PersonDataOnDemand;
import org.rad.roo.document.domain.PersonIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PersonIntegrationTest_Roo_IntegrationTest {
    
    declare @type: PersonIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: PersonIntegrationTest: @ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml");
    
    declare @type: PersonIntegrationTest: @Transactional;
    
    @Autowired
    PersonDataOnDemand PersonIntegrationTest.dod;
    
    @Test
    public void PersonIntegrationTest.testCountPeople() {
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", dod.getRandomPerson());
        long count = Person.countPeople();
        Assert.assertTrue("Counter for 'Person' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void PersonIntegrationTest.testFindPerson() {
        Person obj = dod.getRandomPerson();
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", obj);
        Long id = obj.getId_();
        Assert.assertNotNull("Data on demand for 'Person' failed to provide an identifier", id);
        obj = Person.findPerson(id);
        Assert.assertNotNull("Find method for 'Person' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'Person' returned the incorrect identifier", id, obj.getId_());
    }
    
    @Test
    public void PersonIntegrationTest.testFindAllPeople() {
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", dod.getRandomPerson());
        long count = Person.countPeople();
        Assert.assertTrue("Too expensive to perform a find all test for 'Person', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<Person> result = Person.findAllPeople();
        Assert.assertNotNull("Find all method for 'Person' illegally returned null", result);
        Assert.assertTrue("Find all method for 'Person' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void PersonIntegrationTest.testFindPersonEntries() {
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", dod.getRandomPerson());
        long count = Person.countPeople();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<Person> result = Person.findPersonEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'Person' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'Person' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void PersonIntegrationTest.testFlush() {
        Person obj = dod.getRandomPerson();
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", obj);
        Long id = obj.getId_();
        Assert.assertNotNull("Data on demand for 'Person' failed to provide an identifier", id);
        obj = Person.findPerson(id);
        Assert.assertNotNull("Find method for 'Person' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyPerson(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'Person' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void PersonIntegrationTest.testMergeUpdate() {
        Person obj = dod.getRandomPerson();
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", obj);
        Long id = obj.getId_();
        Assert.assertNotNull("Data on demand for 'Person' failed to provide an identifier", id);
        obj = Person.findPerson(id);
        boolean modified =  dod.modifyPerson(obj);
        Integer currentVersion = obj.getVersion();
        Person merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId_(), id);
        Assert.assertTrue("Version for 'Person' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void PersonIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", dod.getRandomPerson());
        Person obj = dod.getNewTransientPerson(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'Person' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'Person' identifier to be null", obj.getId_());
        try {
            obj.persist();
        } catch (final ConstraintViolationException e) {
            final StringBuilder msg = new StringBuilder();
            for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                final ConstraintViolation<?> cv = iter.next();
                msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
            }
            throw new IllegalStateException(msg.toString(), e);
        }
        obj.flush();
        Assert.assertNotNull("Expected 'Person' identifier to no longer be null", obj.getId_());
    }
    
    @Test
    public void PersonIntegrationTest.testRemove() {
        Person obj = dod.getRandomPerson();
        Assert.assertNotNull("Data on demand for 'Person' failed to initialize correctly", obj);
        Long id = obj.getId_();
        Assert.assertNotNull("Data on demand for 'Person' failed to provide an identifier", id);
        obj = Person.findPerson(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'Person' with identifier '" + id + "'", Person.findPerson(id));
    }
    
}
