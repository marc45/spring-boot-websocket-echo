package org.devzen.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Date;

/**
 * TODO: 这里要写注释的!
 */
public class EchoWebSocketHandler extends TextWebSocketHandler {
    private static final Logger LOG = LoggerFactory.getLogger(EchoWebSocketHandler.class);

    public EchoWebSocketHandler() {
        LOG.debug("init EchoWebSocketHandler");
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        LOG.debug("get message:" + message.getPayload());
        session.sendMessage(new TextMessage("reply:" + message.getPayload() + " at " + new Date()));
    }

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
        LOG.debug("handleBinaryMessage");
        super.handleBinaryMessage(session, message);
    }

    @Override public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        LOG.debug("afterConnectionEstablished");
        super.afterConnectionEstablished(session);
    }

    @Override public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        LOG.debug("handleMessage");
        super.handleMessage(session, message);
    }

    @Override protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        LOG.debug("handlePongMessage");
        super.handlePongMessage(session, message);
    }

    @Override public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        LOG.debug("handleTransportError", exception);
        super.handleTransportError(session, exception);
    }

    @Override public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        LOG.debug("afterConnectionClosed");
        super.afterConnectionClosed(session, status);
    }

    @Override public boolean supportsPartialMessages() {
        LOG.debug("supportsPartialMessages");
        return super.supportsPartialMessages();
    }
}
