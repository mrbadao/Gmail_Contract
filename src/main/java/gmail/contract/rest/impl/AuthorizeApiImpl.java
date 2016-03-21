/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest.impl;

import gmail.contract.rest.AuthorizeApi;
import gmail.contract.service.AuthorizeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.mail.ImapIdleChannelAdapter;
import org.springframework.integration.mail.ImapMailReceiver;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Component
public class AuthorizeApiImpl implements AuthorizeApi {
	static Logger log = Logger.getLogger(AuthorizeApiImpl.class);

	@Autowired
	private AuthorizeService authorizeService;

	@Override
	public String authorizeUser(MultivaluedMap<String, String> credential) {
		ImapIdleChannelAdapter imapIdleChannelAdapter = null;
		ImapMailReceiver imapMailReceiver = null;

//		try {
//			imapMailReceiver = new ImapMailReceiver("imaps://" + URLEncoder.encode("hieunc18@gmail.com", "UTF-8") + ":07781266010@imap.gmail.com:993/INBOX");
//			imapMailReceiver.setShouldMarkMessagesAsRead(true);
//			imapMailReceiver.setShouldDeleteMessages(false);
//
//			Properties javaMailProperties = new Properties();
//			javaMailProperties.put(MAIL_IMAP_SOCKET_FACTORY_CLASS, environment.getProperty(MAIL_IMAP_SOCKET_FACTORY_CLASS, SOCKET_FACTORY_CLASS));
//			javaMailProperties.put(MAIL_IMAP_SOCKET_FACTORY_FALLBACK, environment.getProperty(MAIL_IMAP_SOCKET_FACTORY_FALLBACK, Boolean.class, SOCKET_FACTORY_FALLBACK));
//			javaMailProperties.put(MAIL_STORE_PROTOCOL, environment.getProperty(MAIL_STORE_PROTOCOL, INBOX_MAIL_PROTOCOL));
//			javaMailProperties.put(MAIL_DEBUG, environment.getProperty(MAIL_DEBUG, Boolean.class, MAIL_DEBUG_VAL));
//			imapMailReceiver.setJavaMailProperties(javaMailProperties);
//
//			imapMailReceiver.setJavaMailAuthenticator(new Authenticator() {
//				@Override
//				protected PasswordAuthentication getPasswordAuthentication() {
//					return new PasswordAuthentication("hieunc18@gmail.com", "07781266010");
//				}
//			});
//
//
//			ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
//			threadPoolTaskScheduler.setPoolSize(environment.getProperty(RECEIVE_MESSAGE_POOL_SIZE, Integer.class, DEFAULT_RECEIVE_MESSAGE_POOL_SIZE));
//			threadPoolTaskScheduler.afterPropertiesSet();
//
//			DirectChannel directChannel = new DirectChannel();
//			directChannel.subscribe(new MessageHandler() {
//				@Override
//				public void handleMessage(Message<?> message) {
//					log.info("Message: " + message);
//
//				}
//			});
//
//
//			imapIdleChannelAdapter = new ImapIdleChannelAdapter(imapMailReceiver);
//			imapIdleChannelAdapter.setAutoStartup(true);
//			imapIdleChannelAdapter.setShouldReconnectAutomatically(true);
//			imapIdleChannelAdapter.setTaskScheduler(threadPoolTaskScheduler);
//			imapIdleChannelAdapter.setOutputChannel(directChannel);
//			imapIdleChannelAdapter.start();
//
//		} catch (IllegalStateException iex){
//			log.debug("Receiving messages failed", iex);
//			iex.printStackTrace();
//			imapIdleChannelAdapter.stop();
//			try{
//				imapMailReceiver.destroy();
//			} catch (Exception ex){
//				log.debug("Impossible destroy imapMailReceiver", ex);
//				ex.printStackTrace();
//			}
//		} catch (UnsupportedEncodingException uex) {
//			log.debug("UnsupportedEncoding Exception", uex);
//			uex.printStackTrace();
//		}
		return "123";
	}
}
