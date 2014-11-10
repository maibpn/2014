package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(StreetDetailsController)
@Mock(StreetDetails)
class StreetDetailsControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/streetDetails/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.streetDetailsInstanceList.size() == 0
        assert model.streetDetailsInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.streetDetailsInstance != null
    }

    void testSave() {
        controller.save()

        assert model.streetDetailsInstance != null
        assert view == '/streetDetails/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/streetDetails/show/1'
        assert controller.flash.message != null
        assert StreetDetails.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/streetDetails/list'

        populateValidParams(params)
        def streetDetails = new StreetDetails(params)

        assert streetDetails.save() != null

        params.id = streetDetails.id

        def model = controller.show()

        assert model.streetDetailsInstance == streetDetails
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/streetDetails/list'

        populateValidParams(params)
        def streetDetails = new StreetDetails(params)

        assert streetDetails.save() != null

        params.id = streetDetails.id

        def model = controller.edit()

        assert model.streetDetailsInstance == streetDetails
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/streetDetails/list'

        response.reset()

        populateValidParams(params)
        def streetDetails = new StreetDetails(params)

        assert streetDetails.save() != null

        // test invalid parameters in update
        params.id = streetDetails.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/streetDetails/edit"
        assert model.streetDetailsInstance != null

        streetDetails.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/streetDetails/show/$streetDetails.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        streetDetails.clearErrors()

        populateValidParams(params)
        params.id = streetDetails.id
        params.version = -1
        controller.update()

        assert view == "/streetDetails/edit"
        assert model.streetDetailsInstance != null
        assert model.streetDetailsInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/streetDetails/list'

        response.reset()

        populateValidParams(params)
        def streetDetails = new StreetDetails(params)

        assert streetDetails.save() != null
        assert StreetDetails.count() == 1

        params.id = streetDetails.id

        controller.delete()

        assert StreetDetails.count() == 0
        assert StreetDetails.get(streetDetails.id) == null
        assert response.redirectedUrl == '/streetDetails/list'
    }
}
