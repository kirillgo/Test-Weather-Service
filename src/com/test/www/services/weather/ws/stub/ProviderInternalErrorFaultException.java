
/**
 * ProviderInternalErrorFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package com.test.www.services.weather.ws.stub;

public class ProviderInternalErrorFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1328255960596L;
    
    private com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE faultMessage;

    
        public ProviderInternalErrorFaultException() {
            super("ProviderInternalErrorFaultException");
        }

        public ProviderInternalErrorFaultException(java.lang.String s) {
           super(s);
        }

        public ProviderInternalErrorFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProviderInternalErrorFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE msg){
       faultMessage = msg;
    }
    
    public com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE getFaultMessage(){
       return faultMessage;
    }
}
    