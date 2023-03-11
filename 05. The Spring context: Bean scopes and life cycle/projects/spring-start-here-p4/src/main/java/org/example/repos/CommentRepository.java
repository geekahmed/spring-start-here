package org.example.repos;

import org.example.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
