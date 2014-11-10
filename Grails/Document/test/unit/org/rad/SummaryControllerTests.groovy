package org.rad



import org.junit.*
import grails.test.mixin.*

@TestFor(SummaryController)
@Mock(Summary)
class SummaryControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/summary/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.summaryInstanceList.size() == 0
        assert model.summaryInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.summaryInstance != null
    }

    void testSave() {
        controller.save()

        assert model.summaryInstance != null
        assert view == '/summary/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/summary/show/1'
        assert controller.flash.message != null
        assert Summary.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/summary/list'

        populateValidParams(params)
        def summary = new Summary(params)

        assert summary.save() != null

        params.id = summary.id

        def model = controller.show()

        assert model.summaryInstance == summary
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/summary/list'

        populateValidParams(params)
        def summary = new Summary(params)

        assert summary.save() != null

        params.id = summary.id

        def model = controller.edit()

        assert model.summaryInstance == summary
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/summary/list'

        response.reset()

        populateValidParams(params)
        def summary = new Summary(params)

        assert summary.save() != null

        // test invalid parameters in update
        params.id = summary.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/summary/edit"
        assert model.summaryInstance != null

        summary.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/summary/show/$summary.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        summary.clearErrors()

        populateValidParams(params)
        params.id = summary.id
        params.version = -1
        controller.update()

        assert view == "/summary/edit"
        assert model.summaryInstance != null
        assert model.summaryInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/summary/list'

        response.reset()

        populateValidParams(params)
        def summary = new Summary(params)

        assert summary.save() != null
        assert Summary.count() == 1

        params.id = summary.id

        controller.delete()

        assert Summary.count() == 0
        assert Summary.get(summary.id) == null
        assert response.redirectedUrl == '/summary/list'
    }
}
