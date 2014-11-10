package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(TelephoneNumberController)
@Mock(TelephoneNumber)
class TelephoneNumberControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/telephoneNumber/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.telephoneNumberInstanceList.size() == 0
        assert model.telephoneNumberInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.telephoneNumberInstance != null
    }

    void testSave() {
        controller.save()

        assert model.telephoneNumberInstance != null
        assert view == '/telephoneNumber/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/telephoneNumber/show/1'
        assert controller.flash.message != null
        assert TelephoneNumber.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/telephoneNumber/list'

        populateValidParams(params)
        def telephoneNumber = new TelephoneNumber(params)

        assert telephoneNumber.save() != null

        params.id = telephoneNumber.id

        def model = controller.show()

        assert model.telephoneNumberInstance == telephoneNumber
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/telephoneNumber/list'

        populateValidParams(params)
        def telephoneNumber = new TelephoneNumber(params)

        assert telephoneNumber.save() != null

        params.id = telephoneNumber.id

        def model = controller.edit()

        assert model.telephoneNumberInstance == telephoneNumber
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/telephoneNumber/list'

        response.reset()

        populateValidParams(params)
        def telephoneNumber = new TelephoneNumber(params)

        assert telephoneNumber.save() != null

        // test invalid parameters in update
        params.id = telephoneNumber.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/telephoneNumber/edit"
        assert model.telephoneNumberInstance != null

        telephoneNumber.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/telephoneNumber/show/$telephoneNumber.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        telephoneNumber.clearErrors()

        populateValidParams(params)
        params.id = telephoneNumber.id
        params.version = -1
        controller.update()

        assert view == "/telephoneNumber/edit"
        assert model.telephoneNumberInstance != null
        assert model.telephoneNumberInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/telephoneNumber/list'

        response.reset()

        populateValidParams(params)
        def telephoneNumber = new TelephoneNumber(params)

        assert telephoneNumber.save() != null
        assert TelephoneNumber.count() == 1

        params.id = telephoneNumber.id

        controller.delete()

        assert TelephoneNumber.count() == 0
        assert TelephoneNumber.get(telephoneNumber.id) == null
        assert response.redirectedUrl == '/telephoneNumber/list'
    }
}
