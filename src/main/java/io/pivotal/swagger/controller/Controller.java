package io.pivotal.swagger.controller;

import io.pivotal.swagger.model.Model;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;

/**
 * Created by jbedenbaugh on 5/31/17.
 */

@SwaggerDefinition(
        info = @Info(
                description = "John Conner must destroy the Terminators",
                version = "V0.0.1",
                title = "Skynet Awakens",
                contact = @Contact(
                        name = "Cyberdyne Systems",
                        email = "miles.dyson@cyberdyne.com",
                        url = "http://www.cyberdyne.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"text/plain", "application/json"},
        produces = {"application/json"},
        tags = {
                @Tag(name = "Private", description = "Tag used to denote operations as private")
        },
        externalDocs = @ExternalDocs(value = "Judgement Day", url = "http://terminator.wikia.com/wiki/Skynet")
)


@RestController
@Api(value = "users", description = "Endpoint for user management")
@Produces("*/*")

public class Controller {

    public Controller() {
    }

    @RequestMapping("/hello")
    @ApiOperation(value = "Returns Hello World", notes = "Returns a hello world message.")
    @ApiParam(name = "helloWorld", value = "null", allowEmptyValue = true)
    @ApiResponses(value =
            {
                    @ApiResponse(code = 200, message = "successful"),
                    @ApiResponse(code = 400, message = "failed")
            })
    public String helloWorld() {

        return new Model().getMessage();
    }
}
