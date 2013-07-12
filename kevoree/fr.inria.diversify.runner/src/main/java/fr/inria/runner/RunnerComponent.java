package fr.inria.runner;

import org.kevoree.annotation.*;
import org.kevoree.framework.AbstractComponentType;
import org.kevoree.log.Log;

/**
 * Created with IntelliJ IDEA.
 * User: jed
 * Date: 12/07/13
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 */
@Library(name = "diversify")
@DictionaryType({
        @DictionaryAttribute(name = "clone", defaultValue = "", optional = false)
})
@ComponentType
public class RunnerComponent extends AbstractComponentType {

    @Start
    public void start(){
        Log.error("START");
    }


    @Stop
    public void stop(){

        Log.error("stop");
    }

    @Update
    public void update(){
        Log.error("update");
    }
}
