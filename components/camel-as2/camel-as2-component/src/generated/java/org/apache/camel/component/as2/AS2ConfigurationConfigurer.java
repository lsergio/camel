/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.as2;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.as2.AS2Configuration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class AS2ConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.as2.internal.AS2ApiName.class);
        map.put("As2From", java.lang.String.class);
        map.put("As2MessageStructure", org.apache.camel.component.as2.api.AS2MessageStructure.class);
        map.put("As2To", java.lang.String.class);
        map.put("As2Version", java.lang.String.class);
        map.put("AsyncMdnPortNumber", java.lang.Integer.class);
        map.put("AttachedFileName", java.lang.String.class);
        map.put("ClientFqdn", java.lang.String.class);
        map.put("CompressionAlgorithm", org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class);
        map.put("DecryptingPrivateKey", java.security.PrivateKey.class);
        map.put("DispositionNotificationTo", java.lang.String.class);
        map.put("EdiMessageCharset", java.lang.String.class);
        map.put("EdiMessageTransferEncoding", java.lang.String.class);
        map.put("EdiMessageType", java.lang.String.class);
        map.put("EncryptingAlgorithm", org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class);
        map.put("EncryptingCertificateChain", java.security.cert.Certificate[].class);
        map.put("From", java.lang.String.class);
        map.put("HostnameVerifier", javax.net.ssl.HostnameVerifier.class);
        map.put("HttpConnectionPoolSize", java.lang.Integer.class);
        map.put("HttpConnectionPoolTtl", java.time.Duration.class);
        map.put("HttpConnectionTimeout", java.time.Duration.class);
        map.put("HttpSocketTimeout", java.time.Duration.class);
        map.put("MdnAccessToken", java.lang.String.class);
        map.put("MdnMessageTemplate", java.lang.String.class);
        map.put("MdnPassword", java.lang.String.class);
        map.put("MdnUserName", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("ReceiptDeliveryOption", java.lang.String.class);
        map.put("RequestUri", java.lang.String.class);
        map.put("Server", java.lang.String.class);
        map.put("ServerFqdn", java.lang.String.class);
        map.put("ServerPortNumber", java.lang.Integer.class);
        map.put("SignedReceiptMicAlgorithms", java.lang.String.class);
        map.put("SigningAlgorithm", org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class);
        map.put("SigningCertificateChain", java.security.cert.Certificate[].class);
        map.put("SigningPrivateKey", java.security.PrivateKey.class);
        map.put("SslContext", javax.net.ssl.SSLContext.class);
        map.put("Subject", java.lang.String.class);
        map.put("TargetHostname", java.lang.String.class);
        map.put("TargetPortNumber", java.lang.Integer.class);
        map.put("UserAgent", java.lang.String.class);
        map.put("UserName", java.lang.String.class);
        map.put("ValidateSigningCertificateChain", java.security.cert.Certificate[].class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.as2.AS2Configuration target = (org.apache.camel.component.as2.AS2Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.as2.internal.AS2ApiName.class, value)); return true;
        case "as2from":
        case "as2From": target.setAs2From(property(camelContext, java.lang.String.class, value)); return true;
        case "as2messagestructure":
        case "as2MessageStructure": target.setAs2MessageStructure(property(camelContext, org.apache.camel.component.as2.api.AS2MessageStructure.class, value)); return true;
        case "as2to":
        case "as2To": target.setAs2To(property(camelContext, java.lang.String.class, value)); return true;
        case "as2version":
        case "as2Version": target.setAs2Version(property(camelContext, java.lang.String.class, value)); return true;
        case "asyncmdnportnumber":
        case "asyncMdnPortNumber": target.setAsyncMdnPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "attachedfilename":
        case "attachedFileName": target.setAttachedFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientfqdn":
        case "clientFqdn": target.setClientFqdn(property(camelContext, java.lang.String.class, value)); return true;
        case "compressionalgorithm":
        case "compressionAlgorithm": target.setCompressionAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class, value)); return true;
        case "decryptingprivatekey":
        case "decryptingPrivateKey": target.setDecryptingPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "dispositionnotificationto":
        case "dispositionNotificationTo": target.setDispositionNotificationTo(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagecharset":
        case "ediMessageCharset": target.setEdiMessageCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagetransferencoding":
        case "ediMessageTransferEncoding": target.setEdiMessageTransferEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagetype":
        case "ediMessageType": target.setEdiMessageType(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptingalgorithm":
        case "encryptingAlgorithm": target.setEncryptingAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class, value)); return true;
        case "encryptingcertificatechain":
        case "encryptingCertificateChain": target.setEncryptingCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        case "from": target.setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "hostnameverifier":
        case "hostnameVerifier": target.setHostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        case "httpconnectionpoolsize":
        case "httpConnectionPoolSize": target.setHttpConnectionPoolSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpconnectionpoolttl":
        case "httpConnectionPoolTtl": target.setHttpConnectionPoolTtl(property(camelContext, java.time.Duration.class, value)); return true;
        case "httpconnectiontimeout":
        case "httpConnectionTimeout": target.setHttpConnectionTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "httpsockettimeout":
        case "httpSocketTimeout": target.setHttpSocketTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "mdnaccesstoken":
        case "mdnAccessToken": target.setMdnAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "mdnmessagetemplate":
        case "mdnMessageTemplate": target.setMdnMessageTemplate(property(camelContext, java.lang.String.class, value)); return true;
        case "mdnpassword":
        case "mdnPassword": target.setMdnPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "mdnusername":
        case "mdnUserName": target.setMdnUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "receiptdeliveryoption":
        case "receiptDeliveryOption": target.setReceiptDeliveryOption(property(camelContext, java.lang.String.class, value)); return true;
        case "requesturi":
        case "requestUri": target.setRequestUri(property(camelContext, java.lang.String.class, value)); return true;
        case "server": target.setServer(property(camelContext, java.lang.String.class, value)); return true;
        case "serverfqdn":
        case "serverFqdn": target.setServerFqdn(property(camelContext, java.lang.String.class, value)); return true;
        case "serverportnumber":
        case "serverPortNumber": target.setServerPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "signedreceiptmicalgorithms":
        case "signedReceiptMicAlgorithms": target.setSignedReceiptMicAlgorithms(property(camelContext, java.lang.String.class, value)); return true;
        case "signingalgorithm":
        case "signingAlgorithm": target.setSigningAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class, value)); return true;
        case "signingcertificatechain":
        case "signingCertificateChain": target.setSigningCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        case "signingprivatekey":
        case "signingPrivateKey": target.setSigningPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "sslcontext":
        case "sslContext": target.setSslContext(property(camelContext, javax.net.ssl.SSLContext.class, value)); return true;
        case "subject": target.setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "targethostname":
        case "targetHostname": target.setTargetHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "targetportnumber":
        case "targetPortNumber": target.setTargetPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "useragent":
        case "userAgent": target.setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "validatesigningcertificatechain":
        case "validateSigningCertificateChain": target.setValidateSigningCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "apiname":
        case "apiName": return org.apache.camel.component.as2.internal.AS2ApiName.class;
        case "as2from":
        case "as2From": return java.lang.String.class;
        case "as2messagestructure":
        case "as2MessageStructure": return org.apache.camel.component.as2.api.AS2MessageStructure.class;
        case "as2to":
        case "as2To": return java.lang.String.class;
        case "as2version":
        case "as2Version": return java.lang.String.class;
        case "asyncmdnportnumber":
        case "asyncMdnPortNumber": return java.lang.Integer.class;
        case "attachedfilename":
        case "attachedFileName": return java.lang.String.class;
        case "clientfqdn":
        case "clientFqdn": return java.lang.String.class;
        case "compressionalgorithm":
        case "compressionAlgorithm": return org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class;
        case "decryptingprivatekey":
        case "decryptingPrivateKey": return java.security.PrivateKey.class;
        case "dispositionnotificationto":
        case "dispositionNotificationTo": return java.lang.String.class;
        case "edimessagecharset":
        case "ediMessageCharset": return java.lang.String.class;
        case "edimessagetransferencoding":
        case "ediMessageTransferEncoding": return java.lang.String.class;
        case "edimessagetype":
        case "ediMessageType": return java.lang.String.class;
        case "encryptingalgorithm":
        case "encryptingAlgorithm": return org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class;
        case "encryptingcertificatechain":
        case "encryptingCertificateChain": return java.security.cert.Certificate[].class;
        case "from": return java.lang.String.class;
        case "hostnameverifier":
        case "hostnameVerifier": return javax.net.ssl.HostnameVerifier.class;
        case "httpconnectionpoolsize":
        case "httpConnectionPoolSize": return java.lang.Integer.class;
        case "httpconnectionpoolttl":
        case "httpConnectionPoolTtl": return java.time.Duration.class;
        case "httpconnectiontimeout":
        case "httpConnectionTimeout": return java.time.Duration.class;
        case "httpsockettimeout":
        case "httpSocketTimeout": return java.time.Duration.class;
        case "mdnaccesstoken":
        case "mdnAccessToken": return java.lang.String.class;
        case "mdnmessagetemplate":
        case "mdnMessageTemplate": return java.lang.String.class;
        case "mdnpassword":
        case "mdnPassword": return java.lang.String.class;
        case "mdnusername":
        case "mdnUserName": return java.lang.String.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "receiptdeliveryoption":
        case "receiptDeliveryOption": return java.lang.String.class;
        case "requesturi":
        case "requestUri": return java.lang.String.class;
        case "server": return java.lang.String.class;
        case "serverfqdn":
        case "serverFqdn": return java.lang.String.class;
        case "serverportnumber":
        case "serverPortNumber": return java.lang.Integer.class;
        case "signedreceiptmicalgorithms":
        case "signedReceiptMicAlgorithms": return java.lang.String.class;
        case "signingalgorithm":
        case "signingAlgorithm": return org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class;
        case "signingcertificatechain":
        case "signingCertificateChain": return java.security.cert.Certificate[].class;
        case "signingprivatekey":
        case "signingPrivateKey": return java.security.PrivateKey.class;
        case "sslcontext":
        case "sslContext": return javax.net.ssl.SSLContext.class;
        case "subject": return java.lang.String.class;
        case "targethostname":
        case "targetHostname": return java.lang.String.class;
        case "targetportnumber":
        case "targetPortNumber": return java.lang.Integer.class;
        case "useragent":
        case "userAgent": return java.lang.String.class;
        case "username":
        case "userName": return java.lang.String.class;
        case "validatesigningcertificatechain":
        case "validateSigningCertificateChain": return java.security.cert.Certificate[].class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.as2.AS2Configuration target = (org.apache.camel.component.as2.AS2Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getAccessToken();
        case "apiname":
        case "apiName": return target.getApiName();
        case "as2from":
        case "as2From": return target.getAs2From();
        case "as2messagestructure":
        case "as2MessageStructure": return target.getAs2MessageStructure();
        case "as2to":
        case "as2To": return target.getAs2To();
        case "as2version":
        case "as2Version": return target.getAs2Version();
        case "asyncmdnportnumber":
        case "asyncMdnPortNumber": return target.getAsyncMdnPortNumber();
        case "attachedfilename":
        case "attachedFileName": return target.getAttachedFileName();
        case "clientfqdn":
        case "clientFqdn": return target.getClientFqdn();
        case "compressionalgorithm":
        case "compressionAlgorithm": return target.getCompressionAlgorithm();
        case "decryptingprivatekey":
        case "decryptingPrivateKey": return target.getDecryptingPrivateKey();
        case "dispositionnotificationto":
        case "dispositionNotificationTo": return target.getDispositionNotificationTo();
        case "edimessagecharset":
        case "ediMessageCharset": return target.getEdiMessageCharset();
        case "edimessagetransferencoding":
        case "ediMessageTransferEncoding": return target.getEdiMessageTransferEncoding();
        case "edimessagetype":
        case "ediMessageType": return target.getEdiMessageType();
        case "encryptingalgorithm":
        case "encryptingAlgorithm": return target.getEncryptingAlgorithm();
        case "encryptingcertificatechain":
        case "encryptingCertificateChain": return target.getEncryptingCertificateChain();
        case "from": return target.getFrom();
        case "hostnameverifier":
        case "hostnameVerifier": return target.getHostnameVerifier();
        case "httpconnectionpoolsize":
        case "httpConnectionPoolSize": return target.getHttpConnectionPoolSize();
        case "httpconnectionpoolttl":
        case "httpConnectionPoolTtl": return target.getHttpConnectionPoolTtl();
        case "httpconnectiontimeout":
        case "httpConnectionTimeout": return target.getHttpConnectionTimeout();
        case "httpsockettimeout":
        case "httpSocketTimeout": return target.getHttpSocketTimeout();
        case "mdnaccesstoken":
        case "mdnAccessToken": return target.getMdnAccessToken();
        case "mdnmessagetemplate":
        case "mdnMessageTemplate": return target.getMdnMessageTemplate();
        case "mdnpassword":
        case "mdnPassword": return target.getMdnPassword();
        case "mdnusername":
        case "mdnUserName": return target.getMdnUserName();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "password": return target.getPassword();
        case "receiptdeliveryoption":
        case "receiptDeliveryOption": return target.getReceiptDeliveryOption();
        case "requesturi":
        case "requestUri": return target.getRequestUri();
        case "server": return target.getServer();
        case "serverfqdn":
        case "serverFqdn": return target.getServerFqdn();
        case "serverportnumber":
        case "serverPortNumber": return target.getServerPortNumber();
        case "signedreceiptmicalgorithms":
        case "signedReceiptMicAlgorithms": return target.getSignedReceiptMicAlgorithms();
        case "signingalgorithm":
        case "signingAlgorithm": return target.getSigningAlgorithm();
        case "signingcertificatechain":
        case "signingCertificateChain": return target.getSigningCertificateChain();
        case "signingprivatekey":
        case "signingPrivateKey": return target.getSigningPrivateKey();
        case "sslcontext":
        case "sslContext": return target.getSslContext();
        case "subject": return target.getSubject();
        case "targethostname":
        case "targetHostname": return target.getTargetHostname();
        case "targetportnumber":
        case "targetPortNumber": return target.getTargetPortNumber();
        case "useragent":
        case "userAgent": return target.getUserAgent();
        case "username":
        case "userName": return target.getUserName();
        case "validatesigningcertificatechain":
        case "validateSigningCertificateChain": return target.getValidateSigningCertificateChain();
        default: return null;
        }
    }
}

