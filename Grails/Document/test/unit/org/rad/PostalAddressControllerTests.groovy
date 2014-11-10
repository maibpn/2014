package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(PostalAddressController)
@Mock(PostalAddress)
class PostalAddressControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/postalAdress/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.postalAdressInstanceList.size() == 0
        assert model.postalAdressInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.postalAdressInstance != null
    }

    void testSave() {
        controller.save()

        assert model.postalAdressInstance != null
        assert view == '/postalAdress/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/postalAdress/show/1'
        assert controller.flash.message != null
        assert PostalAddress.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/postalAdress/list'

        populateValidParams(params)
        def postalAdress = new PostalAddress(params)

        assert postalAdress.save() != null

        params.id = postalAdress.id

        def model = controller.show()

        assert model.postalAdressInstance == postalAdress
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/postalAdress/list'

        populateValidParams(params)
        def postalAdress = new PostalAddress(params)

        assert postalAdress.save() != null

        params.id = postalAdress.id

        def model = controller.edit()

        assert model.postalAdressInstance == postalAdress
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/postalAdress/list'

        response.reset()

        populateValidParams(params)
        def postalAdress = new PostalAddress(params)

        assert postalAdress.save() != null

        // test invalid parameters in update
        params.id = postalAdress.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/postalAdress/edit"
        assert model.postalAdressInstance != null

        postalAdress.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/postalAdress/show/$postalAdress.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        postalAdress.clearErrors()

        populateValidParams(params)
        params.id = postalAdress.id
        params.version = -1
        controller.update()

        assert view == "/postalAdress/edit"
        assert model.postalAdressInstance != null
        assert model.postalAdressInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/postalAdress/list'

        response.reset()

        populateValidParams(params)
        def postalAdress = new PostalAddress(params)

        assert postalAdress.save() != null
        assert PostalAddress.count() == 1

        params.id = postalAdress.id

        controller.delete()

        assert PostalAddress.count() == 0
        assert PostalAddress.get(postalAdress.id) == null
        assert response.redirectedUrl == '/postalAdress/list'
    }
}
