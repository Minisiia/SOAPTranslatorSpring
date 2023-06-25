## SOAPTranslatorSpring
Implement your first simple SOAP word translation services. The service knows about 20 words in English. You enter a word in Ukrainian, and the service gives an answer in English.

## 6. Web service. 4. rest & soap

## Задание 4

Реализуйте свои первые простые SOAP и RESTfull сервисы для перевода слов. Сервис знает около 20 слов на английском языке. Вы вводите слово на украинском, а сервис дает ответ на английском.

## Заметки

### SOAP Request

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://example.com/translator">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:TranslationRequest>
         <word>конфета</word>
      </gs:TranslationRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

### SOAP Response

```
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns3:TranslationResponse xmlns:ns3="http://example.com/translator">
            <translatedWord>candy</translatedWord>
        </ns3:TranslationResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

### translator.wdsl


```
<wsdl:definitions xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:sch="http://example.com/translator" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://example.com/translator" targetNamespace="http://example.com/translator">
<wsdl:types>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" targetNamespace="http://example.com/translator">
<xs:element name="TranslationRequest">
<xs:complexType>
<xs:sequence>
<xs:element name="word" type="xs:string"/>
</xs:sequence>
</xs:complexType>
</xs:element>
<xs:element name="TranslationResponse">
<xs:complexType>
<xs:sequence>
<xs:element name="translatedWord" type="xs:string"/>
</xs:sequence>
</xs:complexType>
</xs:element>
</xs:schema>
</wsdl:types>
<wsdl:message name="TranslationRequest">
<wsdl:part element="tns:TranslationRequest" name="TranslationRequest"> </wsdl:part>
</wsdl:message>
<wsdl:message name="TranslationResponse">
<wsdl:part element="tns:TranslationResponse" name="TranslationResponse"> </wsdl:part>
</wsdl:message>
<wsdl:portType name="TranslatorPort">
<wsdl:operation name="Translation">
<wsdl:input message="tns:TranslationRequest" name="TranslationRequest"> </wsdl:input>
<wsdl:output message="tns:TranslationResponse" name="TranslationResponse"> </wsdl:output>
</wsdl:operation>
</wsdl:portType>
<wsdl:binding name="TranslatorPortSoap11" type="tns:TranslatorPort">
<soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="Translation">
<soap:operation soapAction=""/>
<wsdl:input name="TranslationRequest">
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output name="TranslationResponse">
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
</wsdl:binding>
<wsdl:service name="TranslatorPortService">
<wsdl:port binding="tns:TranslatorPortSoap11" name="TranslatorPortSoap11">
<soap:address location="http://localhost:8080/ws"/>
</wsdl:port>
</wsdl:service>
</wsdl:definitions>
```
