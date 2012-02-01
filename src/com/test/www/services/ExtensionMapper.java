
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

        
            package com.test.www.services;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.test.com/services".equals(namespaceURI) &&
                  "ProviderNotAvailableFault".equals(typeName)){
                   
                            return  com.test.www.services.ProviderNotAvailableFault.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services".equals(namespaceURI) &&
                  "GetWeatherResponseParams".equals(typeName)){
                   
                            return  com.test.www.services.GetWeatherResponseParams.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services".equals(namespaceURI) &&
                  "UnknownLocationFault".equals(typeName)){
                   
                            return  com.test.www.services.UnknownLocationFault.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services".equals(namespaceURI) &&
                  "ProviderInternalErrorFault".equals(typeName)){
                   
                            return  com.test.www.services.ProviderInternalErrorFault.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services".equals(namespaceURI) &&
                  "Provider".equals(typeName)){
                   
                            return  com.test.www.services.Provider.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services".equals(namespaceURI) &&
                  "GetWeatherRequestParams".equals(typeName)){
                   
                            return  com.test.www.services.GetWeatherRequestParams.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    