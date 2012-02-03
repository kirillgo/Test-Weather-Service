
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

        
            package com.test.www.services.weather.ws.stub;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "dates_type0".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.Dates_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "Provider".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.Provider.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "GetWeatherRequestParams".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.GetWeatherRequestParams.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "Weather".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.Weather.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "GetWeatherResponseParams".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.GetWeatherResponseParams.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "ProviderNotAvailableFault".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.ProviderNotAvailableFault.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "UnknownLocationFault".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.UnknownLocationFault.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.test.com/services/weather".equals(namespaceURI) &&
                  "ProviderInternalErrorFault".equals(typeName)){
                   
                            return  com.test.www.services.weather.ws.stub.ProviderInternalErrorFault.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    