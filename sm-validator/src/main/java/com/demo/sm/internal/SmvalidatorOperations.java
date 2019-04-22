package com.demo.sm.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import com.demo.sm.Stub;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class SmvalidatorOperations {

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */
  @MediaType(value = ANY, strict = false)
  public String retrieveInfo(@Config SmvalidatorConfiguration configuration, @Connection SmvalidatorConnection connection){
    return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]";
  }

  /**
   * Leverages third party jar to validate session. A lot more logic could happen here
   * but this is sufficient to illustrate the point
   * @param session
   * @return
   */
  @MediaType(value = ANY, strict = false)
  public boolean validateSession(String session) {

    Stub smStub = new Stub();

    return smStub.validateToken(session);
  }

  /**
   * Example of a simple operation that receives a string parameter and returns a new string message that will be set on the payload.
   */
  @MediaType(value = ANY, strict = false)
  public String sayHi(String person) {
    return buildHelloMessage(person);
  }

  /**
   * Private Methods are not exposed as operations
   */
  private String buildHelloMessage(String person) {
    return "Hello " + person + "!!!";
  }
}
