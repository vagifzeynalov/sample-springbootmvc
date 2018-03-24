package com.zeynalov.sample.springbootmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public final class RestApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestApiController.class);


    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/resources")
    public List<ResourceViewModel> getAll() {
        LOGGER.trace("Return all resources");

        ResourceViewModel model = new ResourceViewModel();
        model.setField1("aaaa");
        model.setField2("bbb");

        return Collections.singletonList(model);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/resources/{resourceId}")
    public ResourceViewModel getOne(@PathVariable final String resourceId) {
        LOGGER.trace("Return single resource");

        ResourceViewModel model = new ResourceViewModel();
        model.setField1(resourceId);
        model.setField2("zzz");

        return model;
    }

    /**
     * POST http://localhost:8080/api/v1/resources/11
     * <p>
     * Request body:
     * {
     * "field1": "xxxx",
     * "field2": "yyyy"
     * }
     *
     * @param resourceId
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, path = "/api/v1/resources/{resourceId}")
    public ResourceViewModel create(@PathVariable final String resourceId, @RequestBody final ResourceViewModel model) {
        LOGGER.trace("Create resource");

        model.setField2("CREATED");

        return model;
    }

    /**
     * PUT http://localhost:8080/api/v1/resources/11
     * <p>
     * Request body:
     * {
     * "field1": "xxxx",
     * "field2": "yyyy"
     * }
     *
     * @param resourceId
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT, path = "/api/v1/resources/{resourceId}")
    public ResourceViewModel update(@PathVariable final String resourceId, @RequestBody final ResourceViewModel model) {
        LOGGER.trace("Update resource");

        model.setField2("UPDATED");

        return model;
    }
}


