package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(KeyWordController)
@Mock(KeyWord)
class KeyWordControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/keyWord/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.keyWordInstanceList.size() == 0
        assert model.keyWordInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.keyWordInstance != null
    }

    void testSave() {
        controller.save()

        assert model.keyWordInstance != null
        assert view == '/keyWord/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/keyWord/show/1'
        assert controller.flash.message != null
        assert KeyWord.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/keyWord/list'

        populateValidParams(params)
        def keyWord = new KeyWord(params)

        assert keyWord.save() != null

        params.id = keyWord.id

        def model = controller.show()

        assert model.keyWordInstance == keyWord
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/keyWord/list'

        populateValidParams(params)
        def keyWord = new KeyWord(params)

        assert keyWord.save() != null

        params.id = keyWord.id

        def model = controller.edit()

        assert model.keyWordInstance == keyWord
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/keyWord/list'

        response.reset()

        populateValidParams(params)
        def keyWord = new KeyWord(params)

        assert keyWord.save() != null

        // test invalid parameters in update
        params.id = keyWord.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/keyWord/edit"
        assert model.keyWordInstance != null

        keyWord.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/keyWord/show/$keyWord.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        keyWord.clearErrors()

        populateValidParams(params)
        params.id = keyWord.id
        params.version = -1
        controller.update()

        assert view == "/keyWord/edit"
        assert model.keyWordInstance != null
        assert model.keyWordInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/keyWord/list'

        response.reset()

        populateValidParams(params)
        def keyWord = new KeyWord(params)

        assert keyWord.save() != null
        assert KeyWord.count() == 1

        params.id = keyWord.id

        controller.delete()

        assert KeyWord.count() == 0
        assert KeyWord.get(keyWord.id) == null
        assert response.redirectedUrl == '/keyWord/list'
    }
}
