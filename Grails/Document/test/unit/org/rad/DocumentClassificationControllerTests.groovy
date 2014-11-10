package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(DocumentClassificationController)
@Mock(DocumentClassification)
class DocumentClassificationControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/documentClassification/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.documentClassificationInstanceList.size() == 0
        assert model.documentClassificationInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.documentClassificationInstance != null
    }

    void testSave() {
        controller.save()

        assert model.documentClassificationInstance != null
        assert view == '/documentClassification/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/documentClassification/show/1'
        assert controller.flash.message != null
        assert DocumentClassification.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/documentClassification/list'

        populateValidParams(params)
        def documentClassification = new DocumentClassification(params)

        assert documentClassification.save() != null

        params.id = documentClassification.id

        def model = controller.show()

        assert model.documentClassificationInstance == documentClassification
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/documentClassification/list'

        populateValidParams(params)
        def documentClassification = new DocumentClassification(params)

        assert documentClassification.save() != null

        params.id = documentClassification.id

        def model = controller.edit()

        assert model.documentClassificationInstance == documentClassification
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/documentClassification/list'

        response.reset()

        populateValidParams(params)
        def documentClassification = new DocumentClassification(params)

        assert documentClassification.save() != null

        // test invalid parameters in update
        params.id = documentClassification.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/documentClassification/edit"
        assert model.documentClassificationInstance != null

        documentClassification.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/documentClassification/show/$documentClassification.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        documentClassification.clearErrors()

        populateValidParams(params)
        params.id = documentClassification.id
        params.version = -1
        controller.update()

        assert view == "/documentClassification/edit"
        assert model.documentClassificationInstance != null
        assert model.documentClassificationInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/documentClassification/list'

        response.reset()

        populateValidParams(params)
        def documentClassification = new DocumentClassification(params)

        assert documentClassification.save() != null
        assert DocumentClassification.count() == 1

        params.id = documentClassification.id

        controller.delete()

        assert DocumentClassification.count() == 0
        assert DocumentClassification.get(documentClassification.id) == null
        assert response.redirectedUrl == '/documentClassification/list'
    }
}
