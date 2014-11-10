package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(TownDetailsController)
@Mock(TownDetails)
class TownDetailsControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/townDetails/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.townDetailsInstanceList.size() == 0
        assert model.townDetailsInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.townDetailsInstance != null
    }

    void testSave() {
        controller.save()

        assert model.townDetailsInstance != null
        assert view == '/townDetails/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/townDetails/show/1'
        assert controller.flash.message != null
        assert TownDetails.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/townDetails/list'

        populateValidParams(params)
        def townDetails = new TownDetails(params)

        assert townDetails.save() != null

        params.id = townDetails.id

        def model = controller.show()

        assert model.townDetailsInstance == townDetails
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/townDetails/list'

        populateValidParams(params)
        def townDetails = new TownDetails(params)

        assert townDetails.save() != null

        params.id = townDetails.id

        def model = controller.edit()

        assert model.townDetailsInstance == townDetails
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/townDetails/list'

        response.reset()

        populateValidParams(params)
        def townDetails = new TownDetails(params)

        assert townDetails.save() != null

        // test invalid parameters in update
        params.id = townDetails.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/townDetails/edit"
        assert model.townDetailsInstance != null

        townDetails.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/townDetails/show/$townDetails.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        townDetails.clearErrors()

        populateValidParams(params)
        params.id = townDetails.id
        params.version = -1
        controller.update()

        assert view == "/townDetails/edit"
        assert model.townDetailsInstance != null
        assert model.townDetailsInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/townDetails/list'

        response.reset()

        populateValidParams(params)
        def townDetails = new TownDetails(params)

        assert townDetails.save() != null
        assert TownDetails.count() == 1

        params.id = townDetails.id

        controller.delete()

        assert TownDetails.count() == 0
        assert TownDetails.get(townDetails.id) == null
        assert response.redirectedUrl == '/townDetails/list'
    }
}
