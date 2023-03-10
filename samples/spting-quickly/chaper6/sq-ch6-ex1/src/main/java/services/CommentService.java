package services;

import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

//стереотипная аннотация
@Service
public class CommentService {

  //средства журналирования JDK
  private Logger logger = Logger.getLogger(CommentService.class.getName());

  /**
   * реализует заданный сценарий использования
   * @param comment
   */
  public void publishComment(Comment comment) {
    logger.info("Publishing comment:" + comment.getText());
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
