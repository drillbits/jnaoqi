/**
 * Copyright (c) 2015 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the COPYING file.
 * Created by epinault and tcruz
 */
package com.aldebaran.qi.helper.proxies;

import com.aldebaran.qi.*;
import com.aldebaran.qi.helper.*;
import java.util.List;
import java.util.Map;


import java.util.List;
/**
* 
* @see <a href="http://doc.aldebaran.lan/doc/master/aldeb-doc/naoqi/vision/allocalization.html#allocalization">NAOqi APIs for ALLocalization </a>
* NAOqi V2.4.x
*/
public class ALLocalization extends ALProxy {

    private AsyncALLocalization asyncProxy;

    public ALLocalization(Session session) throws Exception{
        super(session);
        asyncProxy = new AsyncALLocalization();
	    asyncProxy.setService(getService());
    }

    /**
     * Get the async version of this proxy
     *
	 * @return a AsyncALLocalization object
	 */
    public AsyncALLocalization async() {
        return asyncProxy;
    }

    /**
    * Get the robot position in world navigation.
    * 
    */
    public List<Float> getRobotPosition(Boolean param1) throws CallError, InterruptedException {
        return (List<Float>)call("getRobotPosition", param1).get();
    }

    /**
    * Get the robot orientation.
    * 
    */
    public Object getRobotOrientation() throws CallError, InterruptedException {
        return (Object)call("getRobotOrientation").get();
    }

    /**
    * 
    * 
    */
    public Object isInGivenZone(Float param1, Float param2, Float param3, Float param4) throws CallError, InterruptedException {
        return (Object)call("isInGivenZone", param1, param2, param3, param4).get();
    }

    /**
    * Go to the robot home.
    * 
    */
    public Integer goToHome() throws CallError, InterruptedException {
        return (Integer)call("goToHome").get();
    }

    /**
    * Go to a given position.
    * 
    */
    public Integer goToPosition(List<Float> param1) throws CallError, InterruptedException {
        return (Integer)call("goToPosition", param1).get();
    }

    /**
    * Get the robot orientation.
    * 
    */
    public Object getRobotOrientation(Boolean param1) throws CallError, InterruptedException {
        return (Object)call("getRobotOrientation", param1).get();
    }

    /**
    * 
    * 
    */
    public Boolean isStatsEnabled() throws CallError, InterruptedException {
        return (Boolean)call("isStatsEnabled").get();
    }

    /**
    * 
    * 
    */
    public void clearStats() throws CallError, InterruptedException{
        call("clearStats").get();
    }

    /**
    * 
    * 
    */
    public Boolean isTraceEnabled() throws CallError, InterruptedException {
        return (Boolean)call("isTraceEnabled").get();
    }

    /**
    * Exits and unregisters the module.
    * 
    */
    public void exit() throws CallError, InterruptedException{
        call("exit").get();
    }

    /**
    * Returns the version of the module.
    * 
    * @return A string containing the version of the module.
    */
    public String version() throws CallError, InterruptedException {
        return (String)call("version").get();
    }

    /**
    * Just a ping. Always returns true
    * 
    * @return returns true
    */
    public Boolean ping() throws CallError, InterruptedException {
        return (Boolean)call("ping").get();
    }

    /**
    * Retrieves the module's method list.
    * 
    * @return An array of method names.
    */
    public List<String> getMethodList() throws CallError, InterruptedException {
        return (List<String>)call("getMethodList").get();
    }

    /**
    * Retrieves a method's description.
    * 
    * @param methodName  The name of the method.
    * @return A structure containing the method's description.
    */
    public Object getMethodHelp(String methodName) throws CallError, InterruptedException {
        return (Object)call("getMethodHelp", methodName).get();
    }

    /**
    * Retrieves the module's description.
    * 
    * @return A structure describing the module.
    */
    public Object getModuleHelp() throws CallError, InterruptedException {
        return (Object)call("getModuleHelp").get();
    }

    /**
    * Wait for the end of a long running method that was called using 'post'
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @param timeoutPeriod  The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero.
    * @return True if the timeout period terminated. False if the method returned.
    */
    public Boolean wait(Integer id, Integer timeoutPeriod) throws CallError, InterruptedException {
        return (Boolean)call("wait", id, timeoutPeriod).get();
    }

    /**
    * Wait for the end of a long running method that was called using 'post', returns a cancelable future
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    */
    public void wait(Integer id) throws CallError, InterruptedException{
        call("wait", id).get();
    }

    /**
    * Returns true if the method is currently running.
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @return True if the method is currently running
    */
    public Boolean isRunning(Integer id) throws CallError, InterruptedException {
        return (Boolean)call("isRunning", id).get();
    }

    /**
    * returns true if the method is currently running
    * 
    * @param id  the ID of the method to wait for
    */
    public void stop(Integer id) throws CallError, InterruptedException{
        call("stop", id).get();
    }

    /**
    * Gets the name of the parent broker.
    * 
    * @return The name of the parent broker.
    */
    public String getBrokerName() throws CallError, InterruptedException {
        return (String)call("getBrokerName").get();
    }

    /**
    * Gets the method usage string. This summarises how to use the method.
    * 
    * @param name  The name of the method.
    * @return A string that summarises the usage of the method.
    */
    public String getUsage(String name) throws CallError, InterruptedException {
        return (String)call("getUsage", name).get();
    }

    /**
    * 
    * 
    */
    public String getMessageFromErrorCode(Integer param1) throws CallError, InterruptedException {
        return (String)call("getMessageFromErrorCode", param1).get();
    }

    /**
    * Stop all robot movements.
    * 
    */
    public void stopAll() throws CallError, InterruptedException{
        call("stopAll").get();
    }

    /**
    * Learn the robot home.
    * 
    */
    public Integer learnHome() throws CallError, InterruptedException {
        return (Integer)call("learnHome").get();
    }

    /**
    * Is the robot in its home?
    * 
    */
    public Boolean isInCurrentHome() throws CallError, InterruptedException {
        return (Boolean)call("isInCurrentHome").get();
    }

    /**
    * Get some information about the current panorama.
    * 
    */
    public Object getCurrentPanoramaDescriptor() throws CallError, InterruptedException {
        return (Object)call("getCurrentPanoramaDescriptor").get();
    }

    /**
    * Get a frame buffer.
    * 
    */
    public Object getFrame(Integer param1, String param2) throws CallError, InterruptedException {
        return (Object)call("getFrame", param1, param2).get();
    }

    /**
    * Delete all panoramas in a directory.
    * 
    * @param pDirectory  Name of the directory
    */
    public Integer clear(String pDirectory) throws CallError, InterruptedException {
        return (Integer)call("clear", pDirectory).get();
    }

    /**
    * Loads panoramas from a directory in the default one.
    * 
    * @param pDirectory  Name of the directory
    */
    public Integer load(String pDirectory) throws CallError, InterruptedException {
        return (Integer)call("load", pDirectory).get();
    }

    /**
    * Save the temporary panoramas in a directory from the default one.
    * 
    * @param pDirectory  Name of the directory
    */
    public Integer save(String pDirectory) throws CallError, InterruptedException {
        return (Integer)call("save", pDirectory).get();
    }

    /**
    * 
    * 
    */
    public Boolean isRelocalizationRequired() throws CallError, InterruptedException {
        return (Boolean)call("isRelocalizationRequired").get();
    }

    /**
    * 
    * 
    */
    public List<Float> getDriftPercentages() throws CallError, InterruptedException {
        return (List<Float>)call("getDriftPercentages").get();
    }

    /**
    * 
    * 
    */
    public Boolean isDataAvailable() throws CallError, InterruptedException {
        return (Boolean)call("isDataAvailable").get();
    }

    /**
    * Get the robot position in world navigation.
    * 
    */
    public List<Float> getRobotPosition() throws CallError, InterruptedException {
        return (List<Float>)call("getRobotPosition").get();
    }


    public class AsyncALLocalization extends ALProxy {

        protected AsyncALLocalization(){
            super();
        }
    
    /**
    * Get the robot position in world navigation.
    * 
    */
    public Future<List<Float>> getRobotPosition(Boolean param1) throws CallError, InterruptedException {
        return call("getRobotPosition", param1);
    }

    /**
    * Get the robot orientation.
    * 
    */
    public Future<Object> getRobotOrientation() throws CallError, InterruptedException {
        return call("getRobotOrientation");
    }

    /**
    * 
    * 
    */
    public Future<Object> isInGivenZone(Float param1, Float param2, Float param3, Float param4) throws CallError, InterruptedException {
        return call("isInGivenZone", param1, param2, param3, param4);
    }

    /**
    * Go to the robot home.
    * 
    */
    public Future<Integer> goToHome() throws CallError, InterruptedException {
        return call("goToHome");
    }

    /**
    * Go to a given position.
    * 
    */
    public Future<Integer> goToPosition(List<Float> param1) throws CallError, InterruptedException {
        return call("goToPosition", param1);
    }

    /**
    * Get the robot orientation.
    * 
    */
    public Future<Object> getRobotOrientation(Boolean param1) throws CallError, InterruptedException {
        return call("getRobotOrientation", param1);
    }

    /**
    * 
    * 
    */
    public Future<Boolean> isStatsEnabled() throws CallError, InterruptedException {
        return call("isStatsEnabled");
    }

    /**
    * 
    * 
    * @return The Future
    */
    public Future<Void> clearStats() throws CallError, InterruptedException{
        return call("clearStats");
    }

    /**
    * 
    * 
    */
    public Future<Boolean> isTraceEnabled() throws CallError, InterruptedException {
        return call("isTraceEnabled");
    }

    /**
    * Exits and unregisters the module.
    * 
    * @return The Future
    */
    public Future<Void> exit() throws CallError, InterruptedException{
        return call("exit");
    }

    /**
    * Returns the version of the module.
    * 
    * @return A string containing the version of the module.
    */
    public Future<String> version() throws CallError, InterruptedException {
        return call("version");
    }

    /**
    * Just a ping. Always returns true
    * 
    * @return returns true
    */
    public Future<Boolean> ping() throws CallError, InterruptedException {
        return call("ping");
    }

    /**
    * Retrieves the module's method list.
    * 
    * @return An array of method names.
    */
    public Future<List<String>> getMethodList() throws CallError, InterruptedException {
        return call("getMethodList");
    }

    /**
    * Retrieves a method's description.
    * 
    * @param methodName  The name of the method.
    * @return A structure containing the method's description.
    */
    public Future<Object> getMethodHelp(String methodName) throws CallError, InterruptedException {
        return call("getMethodHelp", methodName);
    }

    /**
    * Retrieves the module's description.
    * 
    * @return A structure describing the module.
    */
    public Future<Object> getModuleHelp() throws CallError, InterruptedException {
        return call("getModuleHelp");
    }

    /**
    * Wait for the end of a long running method that was called using 'post'
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @param timeoutPeriod  The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero.
    * @return True if the timeout period terminated. False if the method returned.
    */
    public Future<Boolean> wait(Integer id, Integer timeoutPeriod) throws CallError, InterruptedException {
        return call("wait", id, timeoutPeriod);
    }

    /**
    * Wait for the end of a long running method that was called using 'post', returns a cancelable future
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @return The Future
    */
    public Future<Void> wait(Integer id) throws CallError, InterruptedException{
        return call("wait", id);
    }

    /**
    * Returns true if the method is currently running.
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @return True if the method is currently running
    */
    public Future<Boolean> isRunning(Integer id) throws CallError, InterruptedException {
        return call("isRunning", id);
    }

    /**
    * returns true if the method is currently running
    * 
    * @param id  the ID of the method to wait for
    * @return The Future
    */
    public Future<Void> stop(Integer id) throws CallError, InterruptedException{
        return call("stop", id);
    }

    /**
    * Gets the name of the parent broker.
    * 
    * @return The name of the parent broker.
    */
    public Future<String> getBrokerName() throws CallError, InterruptedException {
        return call("getBrokerName");
    }

    /**
    * Gets the method usage string. This summarises how to use the method.
    * 
    * @param name  The name of the method.
    * @return A string that summarises the usage of the method.
    */
    public Future<String> getUsage(String name) throws CallError, InterruptedException {
        return call("getUsage", name);
    }

    /**
    * 
    * 
    */
    public Future<String> getMessageFromErrorCode(Integer param1) throws CallError, InterruptedException {
        return call("getMessageFromErrorCode", param1);
    }

    /**
    * Stop all robot movements.
    * 
    * @return The Future
    */
    public Future<Void> stopAll() throws CallError, InterruptedException{
        return call("stopAll");
    }

    /**
    * Learn the robot home.
    * 
    */
    public Future<Integer> learnHome() throws CallError, InterruptedException {
        return call("learnHome");
    }

    /**
    * Is the robot in its home?
    * 
    */
    public Future<Boolean> isInCurrentHome() throws CallError, InterruptedException {
        return call("isInCurrentHome");
    }

    /**
    * Get some information about the current panorama.
    * 
    */
    public Future<Object> getCurrentPanoramaDescriptor() throws CallError, InterruptedException {
        return call("getCurrentPanoramaDescriptor");
    }

    /**
    * Get a frame buffer.
    * 
    */
    public Future<Object> getFrame(Integer param1, String param2) throws CallError, InterruptedException {
        return call("getFrame", param1, param2);
    }

    /**
    * Delete all panoramas in a directory.
    * 
    * @param pDirectory  Name of the directory
    */
    public Future<Integer> clear(String pDirectory) throws CallError, InterruptedException {
        return call("clear", pDirectory);
    }

    /**
    * Loads panoramas from a directory in the default one.
    * 
    * @param pDirectory  Name of the directory
    */
    public Future<Integer> load(String pDirectory) throws CallError, InterruptedException {
        return call("load", pDirectory);
    }

    /**
    * Save the temporary panoramas in a directory from the default one.
    * 
    * @param pDirectory  Name of the directory
    */
    public Future<Integer> save(String pDirectory) throws CallError, InterruptedException {
        return call("save", pDirectory);
    }

    /**
    * 
    * 
    */
    public Future<Boolean> isRelocalizationRequired() throws CallError, InterruptedException {
        return call("isRelocalizationRequired");
    }

    /**
    * 
    * 
    */
    public Future<List<Float>> getDriftPercentages() throws CallError, InterruptedException {
        return call("getDriftPercentages");
    }

    /**
    * 
    * 
    */
    public Future<Boolean> isDataAvailable() throws CallError, InterruptedException {
        return call("isDataAvailable");
    }

    /**
    * Get the robot position in world navigation.
    * 
    */
    public Future<List<Float>> getRobotPosition() throws CallError, InterruptedException {
        return call("getRobotPosition");
    }

    }
}
    