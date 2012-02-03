
/**
 * UnknownLocationFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package com.test.www.services.weather.ws.stub;

public class UnknownLocationFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1328255960606L;
    
    private com.test.www.services.weather.ws.stub.UnknownLocationFaultE faultMessage;

    
        public UnknownLocationFaultException() {
            super("UnknownLocationFaultException");
        }

        public UnknownLocationFaultException(java.lang.String s) {
           super(s);
        }

        public UnknownLocationFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnknownLocationFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.test.www.services.weather.ws.stub.UnknownLocationFaultE msg){
       faultMessage = msg;
    }
    
    public com.test.www.services.weather.ws.stub.UnknownLocationFaultE getFaultMessage(){
       return faultMessage;
    }
}
    