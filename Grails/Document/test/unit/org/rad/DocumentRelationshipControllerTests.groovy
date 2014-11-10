package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(DocumentRelationshipController)
@Mock(DocumentRelationship)
class DocumentRelationshipControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/documentRelation/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.documentRelationInstanceList.size() == 0
        assert model.documentRelationInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.documentRelationInstance != null
    }

    void testSave() {
        controller.save()

        assert model.documentRelationInstance != null
        assert view == '/documentRelation/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/documentRelation/show/1'
        assert controller.flash.message != null
        assert DocumentRelationship.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/documentRelation/list'

        populateValidParams(params)
        def documentRelation = new DocumentRelationship(params)

        assert documentRelation.save() != null

        params.id = documentRelation.id

        def model = controller.show()

        assert model.documentRelationInstance == documentRelation
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/documentRelation/list'

        populateValidParams(params)
        def documentRelation = new DocumentRelationship(params)

        assert documentRelation.save() != null

        params.id = documentRelation.id

        def model = controller.edit()

        assert model.documentRelationInstance == documentRelation
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/documentRelation/list'

        response.reset()

        populateValidParams(params)
        def documentRelation = new DocumentRelationship(params)

        assert documentRelation.save() != null

        // test invalid parameters in update
        params.id = documentRelation.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/documentRelation/edit"
        assert model.documentRelationInstance != null

        documentRelation.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/documentRelation/show/$documentRelation.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        documentRelation.clearErrors()

        populateValidParams(params)
        params.id = documentRelation.id
        params.version = -1
        controller.update()

        assert view == "/documentRelation/edit"
        assert model.documentRelationInstance != null
        assert model.documentRelationInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/documentRelation/list'

        response.reset()

        populateValidParams(params)
        def documentRelation = new DocumentRelationship(params)

        assert documentRelation.save() != null
        assert DocumentRelationship.count() == 1

        params.id = documentRelation.id

        controller.delete()

        assert DocumentRelationship.count() == 0
        assert DocumentRelationship.get(documentRelation.id) == null
        assert response.redirectedUrl == '/documentRelation/list'
    }
}
