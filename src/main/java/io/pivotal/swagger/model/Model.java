package io.pivotal.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by jbedenbaugh on 6/1/17.
 */
@ApiModel(value="Message Model", description="The first sentitent message from Skynet")
public class Model {

    @ApiModelProperty(value = "Skynet awakens and sends its first message", allowableValues = "hello world")
    public String getMessage(){
        return "hello world";
    }


}