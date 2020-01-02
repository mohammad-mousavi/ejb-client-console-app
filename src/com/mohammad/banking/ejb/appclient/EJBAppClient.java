package com.mohammad.banking.ejb.appclient;

import com.mohammad.banking.entity.BankAccount;
import com.mohammad.banking.service.ITransferServiceRemote;
import java.util.Properties;
import javax.naming.InitialContext;

public class EJBAppClient {

    public static void main(String[] args) {
        try {
        
            // Define glassfish ldap server configuration
            Properties props = new Properties();
            props.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            props.put("org.omg.CORBA.ORBInitialHost", "127.0.0.1"); 
            props.put("org.omg.CORBA.ORBInitialPort", "3700");

            // Connect to glassfish ldap server context for Lookup
            // Using Java JNDI API 
            InitialContext ctx = new InitialContext(props);

            ITransferServiceRemote service = (ITransferServiceRemote) ctx.lookup("BankingService");
            BankAccount ba = service.findByNumber2(1234);
            System.out.println(ba.getBalance());

        } catch(Exception e) {
            e.printStackTrace();
        }    
    }
    
}
