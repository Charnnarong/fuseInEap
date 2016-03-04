package com.kone.cth.GwtTestEapFuse.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
  String greetServer(String name) throws IllegalArgumentException;
  String testCamelComponents();
  String testahc();
  String testamqp();
  String testapns();
  String testbeanvalidator();
  String testcache();
  String testcamelcore();
  String testcontext();
  String testejb();
  String testfreemarker();
  String testjdbc();
  String testjetty();
  String testjpa();
  String testjt400();
  String testldap();
  String testmongodb();
  String testnetty();
  String testnettyhttp();
  String testprinter();
  String testquartz();
  String testservletlistener();
  String testsql();
  String testssh();
  String teststringtemplate();
  String testurlrewrite();
  String testwebsocket();
  String testxmlrpc();
  String testxmpp();
  
}
