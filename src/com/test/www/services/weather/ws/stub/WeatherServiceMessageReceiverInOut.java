
/**
 * WeatherServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package com.test.www.services.weather.ws.stub;

        /**
        *  WeatherServiceMessageReceiverInOut message receiver
        */

        public class WeatherServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        WeatherServiceSkeleton skel = (WeatherServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getWeather".equals(methodName)){
                
                com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE getWeatherResponseParams1 = null;
	                        com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE wrappedParam =
                                                             (com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getWeatherResponseParams1 =
                                                   
                                                   
                                                         skel.getWeather(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getWeatherResponseParams1, false, new javax.xml.namespace.QName("http://www.test.com/services/weather",
                                                    "getWeather"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ProviderInternalErrorFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"providerInternalErrorFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (UnknownLocationFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"unknownLocationFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ProviderNotAvailableFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"providerNotAvailableFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.test.www.services.weather.ws.stub.UnknownLocationFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.test.www.services.weather.ws.stub.UnknownLocationFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.test.www.services.weather.ws.stub.ProviderNotAvailableFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.test.www.services.weather.ws.stub.ProviderNotAvailableFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE wrapgetWeather(){
                                com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE wrappedElement = new com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE.class.equals(type)){
                
                           return com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE.class.equals(type)){
                
                           return com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE.class.equals(type)){
                
                           return com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.test.www.services.weather.ws.stub.UnknownLocationFaultE.class.equals(type)){
                
                           return com.test.www.services.weather.ws.stub.UnknownLocationFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.test.www.services.weather.ws.stub.ProviderNotAvailableFaultE.class.equals(type)){
                
                           return com.test.www.services.weather.ws.stub.ProviderNotAvailableFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    