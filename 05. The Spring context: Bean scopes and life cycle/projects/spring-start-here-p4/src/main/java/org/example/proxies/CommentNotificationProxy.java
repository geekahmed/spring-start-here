package org.example.proxies;

import org.example.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
