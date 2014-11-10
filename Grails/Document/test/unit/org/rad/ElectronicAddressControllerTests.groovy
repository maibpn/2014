package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(ElectronicAddressController)
@Mock(ElectronicAddress)
class ElectronicAddressControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/electronicAddress/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.electronicAddressInstanceList.size() == 0
        assert model.electronicAddressInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.electronicAddressInstance != null
    }

    void testSave() {
        controller.save()

        assert model.electronicAddressInstance != null
        assert view == '/electronicAddress/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/electronicAddress/show/1'
        assert controller.flash.message != null
        assert ElectronicAddress.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/electronicAddress/list'

        populateValidParams(params)
        def electronicAddress = new ElectronicAddress(params)

        assert electronicAddress.save() != null

        params.id = electronicAddress.id

        def model = controller.show()

        assert model.electronicAddressInstance == electronicAddress
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/electronicAddress/list'

        populateValidParams(params)
        def electronicAddress = new ElectronicAddress(params)

        assert electronicAddress.save() != null

        params.id = electronicAddress.id

        def model = controller.edit()

        assert model.electronicAddressInstance == electronicAddress
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/electronicAddress/list'

        response.reset()

        populateValidParams(params)
        def electronicAddress = new ElectronicAddress(params)

        assert electronicAddress.save() != null

        // test invalid parameters in update
        params.id = electronicAddress.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/electronicAddress/edit"
        assert model.electronicAddressInstance != null

        electronicAddress.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/electronicAddress/show/$electronicAddress.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        electronicAddress.clearErrors()

        populateValidParams(params)
        params.id = electronicAddress.id
        params.version = -1
        controller.update()

        assert view == "/electronicAddress/edit"
        assert model.electronicAddressInstance != null
        assert model.electronicAddressInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/electronicAddress/list'

        response.reset()

        populateValidParams(params)
        def electronicAddress = new ElectronicAddress(params)

        assert electronicAddress.save() != null
        assert ElectronicAddress.count() == 1

        params.id = electronicAddress.id

        controller.delete()

        assert ElectronicAddress.count() == 0
        assert ElectronicAddress.get(electronicAddress.id) == null
        assert response.redirectedUrl == '/electronicAddress/list'
    }
}
